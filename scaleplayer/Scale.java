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
		
		String[] noteSequence = this.getNoteSequence() ;
		List<String> noteCollection = new ArrayList<String>();
		noteCollection.addAll(Arrays.asList(noteSequence));
		noteCollection.addAll(Arrays.asList(noteSequence));

		String scale = this.getRoot() ;
		String noteSeparator = ",";

		int currentPosition = noteCollection.indexOf(this.getRoot()) ;
		
		for ( int seq : getSequence() )
		{
			scale = scale + noteSeparator ;
			currentPosition = currentPosition + seq ;
			String noteToAdd = noteCollection.get(currentPosition);
			scale = scale + noteToAdd;
			noteSeparator = ",";
		}
		
		return scale;
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
