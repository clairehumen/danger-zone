/**
 * Created by clairehumen on 3/20/17.
 */
public abstract class Scale {
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
    public static final int MINOR_THIRD = 3;
    public static final int MAJOR_THIRD = 4;
    public static final int FOURTH = 5;
    public static final int FIFTH = 6;
    public static final int SIXTH
}
