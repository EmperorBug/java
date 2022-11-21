package nine;

import java.util.Scanner;

//트라이 캐치 - 프로그램을 안죽게 하기 위해 사용
//          트라이 부분에서 에러발생시 에러 난 부분이후코드는 무시
public class ExceptionCase {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        try {
            System.out.println("a/b...?");
            int n1 = kb.nextInt();
            System.out.println("a/b...b?");
            int n2 = kb.nextInt();
            System.out.printf("%d / %d = %d \n",n1,n2,n1/n2);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Good bye~~~!");
    }
}
