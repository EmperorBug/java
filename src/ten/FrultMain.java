package ten;

public class FrultMain {
    public static void main(String[] args) {
        Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
        for(Fruit f : fAry)
            f.print();
    }
}
