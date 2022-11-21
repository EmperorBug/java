package nine;

public class LPrinterDriver extends Printable{
    @Override
    public void print(String doc) {
        System.out.println("From LG printer");
        System.out.println(doc);
    }
}
