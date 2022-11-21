package five;

public class Box {
    private int num;
    private String str;
    public Box(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public String toString() {
        return str;
    }
    public int getBoxNum() {
        return num;
    }

    public String getStr() {
        return str;
    }
}
