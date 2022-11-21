package five;

import java.util.Scanner;

public class ArrayRandom2 {

    static char[] ranArr;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int col = 0;
        int row = 0;
        char temp = 0;


        System.out.println("행을 입력해주세요");

        while (!sc.hasNextInt()) {
            System.out.println("1~10사이에 정수를 입력해주세요");
            sc.next();
        }

        row = sc.nextInt();
        System.out.println("행 : "+row);

        System.out.println("열을 입력해주세요");

        while (!sc.hasNextInt()) {
            System.out.println("1~10사이에 정수를 입력해주세요");
            sc.next();
        }

        col = sc.nextInt();
        System.out.println("열 : "+col);

        ranArr = new char[col*row];
        char[][] arr = new char[col][row];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                temp = (char)(Math.random()*26+65);
                if (checkSum(temp)) {
                    j--;
                }
                else {
                    arr[i][j] = temp;
                }
            }
        }

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static boolean checkSum(char cha) {
        boolean chk = false;
        System.out.println(ranArr.length);
        for (int i = 0; i < ranArr.length; i++) {
            System.out.println(", 들어온값 : "+cha);
            if (ranArr[i] == cha) {
                chk = true;

            }
            else {
                ranArr[i] = cha;
            }
        }

        return chk;
    }
}
