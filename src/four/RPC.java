package four;

import java.util.Scanner;

public class RPC {
    private String com;

    private int ran;
    private String result;

    private String me;

    public void choice() {
        Scanner sc = new Scanner(System.in);
        me = sc.nextLine();

        ran = (int)(Math.random()*3)+1;
    }

    //1 : 가위 2: 바위 3: 보
    public String game() {
        boolean flag = true;
        do {
            choice();
            switch (ran) {
                case 1 :
                    com = "가위";
                    System.out.println(com);

                    if (me.equals("가위")) {
                        result = "비겼습니다";
                        break;
                    } else if (me.equals("바위")) {
                        result = "이겼습니다";
                        break;
                    }
                    else result = "졌습니다"; break;

                case 2 :
                    com = "바위";
                    System.out.println(com);

                    if (me.equals("가위")) {
                        result = "졌습니다";
                        break;
                    } else if (me.equals("바위")) {
                        result = "비겼습니다";
                        break;
                    }
                    else result = "이겼습니다";break;

                case 3:
                    com = "보";
                    System.out.println(com);

                    if (me.equals("가위")) {
                        result = "이겼습니다";
                        break;
                    } else if (me.equals("바위")) {
                        result = "졌습니다";
                        break;
                    }
                    else result = "비겼습니다"; break;
            }
            System.out.println(result+" 계속 하시겠습니까?");
            Scanner sc = new Scanner(System.in);
            if (sc.next().equals("y")) {
                flag = true;
            }
            else flag = false;

        }
        while (flag);

        return result;
    }
}
