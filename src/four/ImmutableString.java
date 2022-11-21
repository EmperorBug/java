package four;

public class ImmutableString {
    public static void main(String[] args) {
        String str1 = "Simple String";
        String st2 = "Simple String";

        String str3 = new String("Simple String");
        String str4 = new String("Simple String");

        if (str1 == st2) {
            System.out.println(true);
        }else {
            System.out.println("n");
        }
        if (str3 == str4) {
            System.out.println(true);
        }else System.out.println("n");
    }
}
