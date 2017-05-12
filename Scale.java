/**
 * Created by clairehumen on 3/20/17.
 */
public abstract class Scale {
	
	public abstract int[] getSequence();
	
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

	public void printScale() {
		System.out.println("I don't know how to do this yet");
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
	public abstract int[] getSequence();
}
