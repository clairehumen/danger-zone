package scaleplayer;
/**
 * Created by clairehumen on 3/20/17.
 */
public class HarmonicMinorScale extends MinorScale {

	public HarmonicMinorScale(String root) {
		super(root);
	}

	@Override
	public int[] getSequence() {
		return new MelodicMinorScale(this.getRoot()).getSequence() ;
	}

	@Override
	public String getDownScale()
	{
		return new NaturalMinorScale(this.getRoot()).getDownScale();
	}
}
