package seven;

import java.util.Scanner;

//겜블링 게임에 참여할 선수 숫자>>3
//        1번째 선수 이름>>영희
//        2번째 선수 이름>>철수
//        3번째 선수 이름>>길동
//        [영희]:<Enter>
//	3  3  2  아쉽군요!
//            [철수]:<Enter>
//	3  3  2  아쉽군요!
//            [길동]:<Enter>
//	1  1  1  길동님이 이겼습니다!
public class GambleVer2 {
    public static void main(String[] args) {

        Boolean chk = true;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("게임에 참여할 선수 숫자 >> ");
        int num = sc.nextInt();
        Person[] person = new Person[num];

        //선수 객체 생성
        for (int i = 0; i <num; i++) {
            System.out.print(i+1+"번째 선수 이름 >> ");
            name = sc.next();
            person[i] = new Person(name);
        }
        String buf = sc.nextLine();
        while (chk) {
            for (int i = 0; i <person.length; i++) {
                System.out.print(person[i].getName()+": <Enter>");
                buf = sc.nextLine();
                person[i].suffle();

                if (person[i].chk()) {
                    chk = false;
                    break;
                }
            }
        }
    }

}
