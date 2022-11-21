package eight;

public class SprinterDriver implements Printable {
    @Override
    public void print(String doc) {
        printCMYK("프린트");

        System.out.println("삼성드라이버");
        System.out.println(doc);
    }
    @Override
    public void printCMYK(String doc) {
        System.out.println("함수오버라이딩 적용됨");
    }
}
