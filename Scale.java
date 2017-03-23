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
}
