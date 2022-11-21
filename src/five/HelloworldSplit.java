package five;

public class HelloworldSplit {
    public static void main(String[] args) {
        String file = "HelloWorld.java";

        String[] strArr = file.split("\\.");
        System.out.println("파일이름은"+strArr[0]+"이며, 확장자는"+strArr[1]+"입니다.");
    }
}
