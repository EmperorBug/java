package java221121;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {
    public static void main(String[] args) {
        String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
        String es = "Life is long if you know how to use it.";

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"));
            bw.write(ks, 0, ks.length());
            bw.newLine();
            bw.write(es, 0, es.length());
            bw.close(); //안쓰면 writer가 끝나지 않으므로 txt파일에 글이 안써짐 혹은 try-with-resources 사용
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
