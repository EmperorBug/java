package four;

public class StringPractice {
    public static void main(String[] args) {
        String str1 = new String("Simple String");
        String str2 = "The best string";

        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println();

        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println();

        showString("Funny string ");
    }

    public static void showString(String str) {
        System.out.println(str);
        System.out.println(str.length());
    }
}
