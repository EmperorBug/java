package ten;

public class DBox<L,R> {
    private L left;
    private R right;

    public void set(L o, R r) {
        this.left = o;
        this.right = r;
    }

    @Override
    public String toString() {
        return left+" & "+right;
    }
}
