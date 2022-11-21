package java221121;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressEx {
    Scanner sc;

    public InetAddressEx() {
        System.out.println("Host 이름을 입력 하세요");

        sc = new Scanner(System.in);
        try {
            InetAddress inetAddress = InetAddress.getByName(sc.next());
            System.out.println("Computer Name : " +inetAddress.getHostName());
            System.out.println("Computer IP : " +inetAddress.getHostAddress());
        }
        catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
