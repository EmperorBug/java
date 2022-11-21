package six;

import java.util.Scanner;

public class Gamble {
    public static void main(String[] args) {
        String buffer = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("1번째 선수 이름 ");
        String user1Name = sc.next();
        System.out.println("1번째 선수 이름 >> "+user1Name);

        System.out.println("2번째 선수 이름 ");
        String user2Name = sc.next();
        System.out.println("2번째 선수 이름 >> "+user2Name);

        Person user1 = new Person(user1Name);
        Person user2 = new Person(user2Name);

        do {
            buffer = sc.nextLine();
            System.out.println("["+user1.getName()+"] :");

            if (user1.getRandom()) {
                System.out.println(user1.getName()+"님이 이겼습니다");
                break;}
            else {
                System.out.print("아쉽네요");
            }
            buffer = sc.nextLine();
            System.out.println("["+user2.getName()+"] :");

            if (user2.getRandom()) {
                System.out.println(user2.getName()+"님이 이겼습니다");
                break;}
            else {
                System.out.print("아쉽네요");
            }
        }while (true);
    }
}
