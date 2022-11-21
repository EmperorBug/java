package nine;

public class UserWrapperClass {
    public static void main(String[] args) {
        Integer iInst = new Integer(3);
        showData(new Double(7.15));
        showData(iInst);
    }
    static void showData(Object obj) {
        System.out.println(obj);

    }
}
