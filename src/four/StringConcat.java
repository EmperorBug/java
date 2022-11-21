package four;

public class StringConcat {
    public static void main(String[] args) {
        int i = 10;
        String str = String.valueOf(i+60.5+'a');
        String str1 = "Coffee";
        String str2 = "Bread";

        System.out.println(str);
        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = "Fresh".concat(str3);
        System.out.println(str4);

        System.out.println(str1==str3);

        System.out.println(str4.substring(3));

        String str5 = "funny";
        str5+="camp";
        System.out.println(str5);
    }
}
