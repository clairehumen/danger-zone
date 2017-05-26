/**
 * Created by clairehumen on 5/25/17.
 */
public class WholeToneScale extends Scale
{

    public WholeToneScale(String root) {
        super(root);
    }

    public int[] getSequence() {
        return new int[] {WHOLE, WHOLE, WHOLE, WHOLE, WHOLE, WHOLE};
    }



}
