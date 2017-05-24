/**
 * Created by clairehumen on 3/20/17.
 */
public class ScaleRunner {
    public static void main (String[] args) {
        Scale ms = new MajorScale(Note.Eb);
        ms.printScale();
        ms = new NaturalMinorScale(Note.E);
        ms.printScale();
        ms = new MelodicMinorScale(Note.C);
        ms.printScale();
        ms = new HarmonicMinorScale(Note.C);
        ms.printScale();
    }
}
