package clairehumen.memegenerator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class MemeGenerator {
	
	private static final int MAX_FONT_SIZE = 48;
    private static final int BOTTOM_MARGIN = 10;
    private static final int TOP_MARGIN = 5;
    private static final int SIDE_MARGIN = 10;

	public static void main(String[] args) throws Exception {
		System.out.println("Making a meme");
		String topCaption = "I DONT ALWAYS PROGRAM";
		String bottomCaption = "BUT WHEN I DO, I PREFER USING JAVA";
		String inputFile = "c:/tmp/MostInterestingMan.jpg";
		String outputFile = "c:/tmp/MostInterestingMan_meme.jpg";
		File outF = new File(outputFile);
		if (outF.exists()) {
			outF.delete();
		}
		BufferedImage image = ImageIO.read(new File(inputFile));
		Graphics graphics = image.getGraphics();
		drawStringCentered(graphics, topCaption, image, true);
		drawStringCentered(graphics, bottomCaption, image, false);
		ImageIO.write(image, "jpg", new File(outputFile));
	}

	private static void drawStringCentered(Graphics g, String text, BufferedImage image, boolean top)
			throws InterruptedException 
	{

		int height = 0;
		int fontSize = MAX_FONT_SIZE;
		int maxCaptionHeight = image.getHeight() / 5;
		int maxLineWidth = image.getWidth() - SIDE_MARGIN * 2;
		String formattedString = "";

		do {
			g.setFont(new Font("Arial", Font.BOLD, fontSize));

			// first inject newlines into the text to wrap properly
			StringBuilder sb = new StringBuilder();
			int left = 0;
			int right = text.length() - 1;
			while (left < right) 
			{
				String substring = text.substring(left, right + 1);
				Rectangle2D stringBounds = g.getFontMetrics().getStringBounds(substring, g);
				while (stringBounds.getWidth() > maxLineWidth) 
				{
					if (Thread.currentThread().isInterrupted()) 
					{
						throw new InterruptedException();
					}

					// look for a space to break the line
					boolean spaceFound = false;
					for (int i = right; i > left; i--) {
						if (text.charAt(i) == ' ') {
							right = i - 1;
							spaceFound = true;
							break;
						}
					}
					substring = text.substring(left, right + 1);
					stringBounds = g.getFontMetrics().getStringBounds(substring, g);

					// If we're down to a single word and we are still too wide,
					// the font is just too big.
					if (!spaceFound && stringBounds.getWidth() > maxLineWidth) {
						break;
					}
				}
				sb.append(substring).append("\n");
				left = right + 2;
				right = text.length() - 1;
			}

			formattedString = sb.toString();

			// now determine if this font size is too big for the allowed height
			height = 0;
			for (String line : formattedString.split("\n")) {
				Rectangle2D stringBounds = g.getFontMetrics().getStringBounds(line, g);
				height += stringBounds.getHeight();
			}
			fontSize--;
		} while (height > maxCaptionHeight);

		// draw the string one line at a time
		int y = 0;
		if (top) {
			y = TOP_MARGIN + g.getFontMetrics().getHeight();
		} else {
			y = image.getHeight() - height - BOTTOM_MARGIN + g.getFontMetrics().getHeight();
		}
		for (String line : formattedString.split("\n")) {
			// Draw each string twice for a shadow effect
			Rectangle2D stringBounds = g.getFontMetrics().getStringBounds(line, g);
			g.setColor(Color.BLACK);
			g.drawString(line, (image.getWidth() - (int) stringBounds.getWidth()) / 2 + 2, y + 2);
			g.setColor(Color.WHITE);
			g.drawString(line, (image.getWidth() - (int) stringBounds.getWidth()) / 2, y);
			y += g.getFontMetrics().getHeight();
		}
	}

}
