package nine;

public class SPrinterDriver extends Printable{
    @Override
    public void print(String doc) {
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}
