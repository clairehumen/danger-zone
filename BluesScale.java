/**
 * Created by clairehumen on 5/25/17.
 */
public class BluesScale extends Scale
{

    public BluesScale(String root) {
        super(root);
    }

    public int[] getSequence() {
        return new int[] {MIN3, WHOLE, HALF, HALF, MIN3, WHOLE};
    }



}
