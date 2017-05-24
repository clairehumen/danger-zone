/**
 * Created by clairehumen on 3/20/17.
 */
public class NaturalMinorScale extends MinorScale {
	
	public NaturalMinorScale(String root) {
		super(root);
	}

    public int[] getSequence() {
        return new int[] {WHOLE, HALF, WHOLE, WHOLE, HALF, WHOLE, WHOLE};
    }
    
	@Override
	public String[] getNoteSequence() {
		/*
		 * The default note sequence for all scales is the flat one unless the root is specifically a sharp. 
		 * In major scales, the sharp scale is used for D, E, G, A and B
		 */
		String[] noteSequence = super.getNoteSequence() ;
		noteSequence = this.getRoot().equals(Note.E) ? Note.NOTE_SEQUENCE2 : noteSequence ;
		noteSequence = this.getRoot().equals(Note.B) ? Note.NOTE_SEQUENCE2 : noteSequence ;
		return noteSequence ;
	}
   
}

