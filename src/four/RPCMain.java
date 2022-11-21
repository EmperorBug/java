package four;

import java.util.Scanner;

public class RPCMain {
    public static void main(String[] args) {
        System.out.println("가위바위보 게임");


        RPC rpc = new RPC();
        System.out.println(rpc.game());
    }
}
