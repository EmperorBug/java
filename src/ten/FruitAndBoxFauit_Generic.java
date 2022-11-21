package ten;

public class FruitAndBoxFauit_Generic {
    public static void main(String[] args) {
        Box<Apple> abox = new Box<Apple>();
        Box<Apple> aabox = new Box<Apple>();
        Box<Orange> obox = new Box<Orange>();

        abox = aabox; //可能

        abox.set(new Apple());
        obox.set(new Orange());

        Apple ap = aabox.get();
        Orange op = obox.get();

        System.out.println(ap);
        System.out.println(op);


        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("Apple", 25);
        System.out.println(box);
    }
}
