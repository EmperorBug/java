package eight;

import java.util.Scanner;

public class UDG {
    public static void main(String[] args) {
        int sw;
        Scanner sc = new Scanner(System.in);
        System.out.println("게임시작 1");
        System.out.print("게임종료 2");
        sw = sc.nextInt();
        switch (sw) {
            case 1:
                game(sc);
                break;
            case 2:
                break;
        }

    }

    public static void game(Scanner sc) {
        int whileSw = 10;
        int rnum = (int) (Math.random() * 100 + 1);

        System.out.print("숫자를 입력해 주세요 :");
        int num = sc.nextInt();
        while (whileSw > 0) {
            whileSw--;

            if (num == rnum) {
                System.out.println("일치");
                System.out.println("=================");
                System.out.println("다시 하시겠습니까?");
                System.out.println("다시시작 1");
                System.out.print("종료 2");
                if (regame(sc.nextInt())) {
                    game(sc);
                    return;
                }
                else break;

            }
            else if(num > rnum){
                System.out.println("Down ====> " + whileSw + "번 남았습니다.");
                System.out.print("숫자를 입력해 주세요 :");
                num = sc.nextInt();
            }
            else {
                System.out.println("Up ====> " + whileSw + "번 남았습니다.");
                System.out.print("숫자를 입력해 주세요 :");
                num = sc.nextInt();
            }
        }
    }

    static boolean regame(int swNum) {
        if (swNum == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}
