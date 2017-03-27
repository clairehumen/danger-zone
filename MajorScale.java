/**
 * Created by clairehumen on 3/20/17.
 */
public class MajorScale extends Scale {
    public MajorScale(String root) {
    super(root);
}
public int[] getSequence() {
    return new int[] {WHOLE, WHOLE, HALF, WHOLE, WHOLE, WHOLE, HALF};
}
}
