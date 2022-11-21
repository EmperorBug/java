package nine;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Throws1 {
    public static void main(String[] args) {
        try {
            md1();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void md1()throws IOException {
        md2();
    }
//컴파일 - 체크드익셉션    실시간(런타임) - 언체크드익셉션
    // 컴파일시 오류         코딩상 오류 (널포인트같은..)
    //함수에서 체크드 익셉션을 던지면 해당 함수를 호출한 곳에서 받아서 무조건 예외처리를 해야함
    static void md2() throws IOException {
        Path file = Paths.get("Users/user/Desktop/directory");
        BufferedWriter writer = null;

        writer = Files.newBufferedWriter(file);

        writer.write('A');
        writer.write('Z');

        if (writer != null)
            writer.close();
    }
}
