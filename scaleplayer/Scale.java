package scaleplayer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by clairehumen on 3/20/17.
 */
public abstract class Scale {
	
	public abstract int[] getSequence();
	
	public String[] getNoteSequence()
	{
		if ( this.getRoot().indexOf('#') >= 0 )
		{
			return Note.NOTE_SEQUENCE2 ;
		}
		return Note.NOTE_SEQUENCE;
	}
	
	public Scale()
	{
		super();
	}
	
	private String root;

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;

	}

	public Scale(String root) {
		super();
		this.setRoot(root);
	}

	public void printRoot() {
		System.out.println(this.root);
	}

	public String getScale() {
		
		/*
		 * Get the sequence of notes for this scale. This is so we know whether to use sharps or flats.
		 */
		String[] noteSequence = this.getNoteSequence() ;
		/*
		 * Define an arraylist of notes. Add two sequences since we don't want to deal with
		 * trying to loop back around when we are getting our notes. Think of this as making a 
		 * two octave chromatic scale.
		 */
		List<String> noteCollection = new ArrayList<String>();
		noteCollection.addAll(Arrays.asList(noteSequence));
		noteCollection.addAll(Arrays.asList(noteSequence));

		/*
		 * This is our final output
		 */
		String scaleOutput = this.getRoot() ;
		/*
		 * What we will use to separate the notes
		 */
		String noteSeparator = ",";

		/*
		 * Now if we have this two octave scale, we just find the root and
		 * walk up the scale by the steps that we have defined in the concrete class. 
		 */
		int currentPosition = noteCollection.indexOf(this.getRoot()) ;
		
		/*
		 * Now just walk through the sequence of steps that define this scale
		 */
		for ( int seq : getSequence() )
		{
			/*
			 * Add the note separator
			 */
			scaleOutput = scaleOutput + noteSeparator ;
			/*
			 * Advance the position
			 */
			currentPosition = currentPosition + seq ;
			/*
			 * Get the note out of the list
			 */
			String noteToAdd = noteCollection.get(currentPosition);
			/*
			 * Add the note to the output
			 */
			scaleOutput = scaleOutput + noteToAdd;
		}
		
		return scaleOutput;
	}
	
	public void printScale()
	{
		System.out.println("TYPE = " + this.getRoot() + " " + this.getClass().getSimpleName());
		System.out.println("UP = " + this.getScale());
		System.out.println("DOWN = " + this.getDownScale());
	}
	
	public String getDownScale()
	{
		/*
		 * Override if needed in the case of the melodic minor scale
		 */
		String scale = this.getScale() ;
		String[] notes = scale.split("[,]");
		String downScale = "" ;
		String noteSeparator = "" ;
		for ( int i = notes.length -1 ; i >= 0 ; i--)
		{
			downScale = downScale + noteSeparator ;
			downScale = downScale + notes[i];
			noteSeparator = ",";
		}
		return downScale ;
	}

	public static final int HALF = 1;
	public static final int WHOLE = 2;
	public static final int MIN3 = 3;
	public static final int MAJ3 = 4;
	public static final int FOURTH = 5;
	public static final int FLAT5 = 6;
	public static final int FIFTH = 7;
	public static final int FLAT6 = 8 ;
	public static final int SIXTH = 9 ;
	public static final int DOM7 = 10 ;
	public static final int MAJ7 = 11 ;

}
