package java221121;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConEx {
    public URLConEx() {
        String code = null;
        System.out.println("웹 주소를 입력해주세여");
        Scanner sc = new Scanner(System.in);
        String address = sc.next();

        try {
            URL url = new URL(address);

            URLConnection con = url.openConnection();
            BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
            FileWriter fw = new FileWriter("InetMain.text",false);

            while ((code = webData.readLine()) != null) {
                fw.write(code);
                System.out.println(code);
            }
            System.out.println("end");
            fw.close();
            webData.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
