package eight;

import java.util.Scanner;

public class CalcMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String simbol = sc.next();
        Calc cal = null;

        switch (simbol) {
            case "+" :
                cal = new Add();
                break;

            case "-" :
                cal = new Sub();
                break;

            case "*" :
                cal = new Mul();
                break;

            case "/" :
                cal = new Div();
                break;
        }

        cal.setA(num1);
        cal.setB(num2);
        cal.calculate();
    }
}
