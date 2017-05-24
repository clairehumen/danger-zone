/**
 * Created by clairehumen on 3/20/17.
 */
public class MelodicMinorScale extends MinorScale {

	public MelodicMinorScale(String root) {
		super(root);
	}
	
	@Override
	public int[] getSequence() {
        return new int[] {WHOLE, HALF, WHOLE, WHOLE, HALF, MIN3, HALF};
	}
}
