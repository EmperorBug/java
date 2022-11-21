package four;

import java.util.Scanner;

public class StringCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int lang = str.length();
        int j = 0;
        int m = 0;

        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                m++;
            }
            else j++;
        }

        System.out.println("총 글자수는 :"+lang);
        System.out.println("자음 글자수는 :"+j);
        System.out.println("모음 글자수는 :"+m);
    }
}
