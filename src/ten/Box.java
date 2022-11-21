package ten;

public class Box<List> {
    private List obj;

    public List get() {
        return obj;
    }

    public void set(List obj) {
        this.obj = obj;
    }
}
