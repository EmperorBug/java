package eight;

public class Prn909Drv implements Printable{
    @Override
    public void print(String doc) {
        System.out.println("블랙 지원");
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("칼러 지원");
    }
}
