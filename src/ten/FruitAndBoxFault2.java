package ten;

public class FruitAndBoxFault2 {
    public static void main(String[] args) {
        Box aBox = new Box();
        Box oBox = new Box();

        // 과일을 박스에 담은 것일까?
        aBox.set("Apple");
        oBox.set("Orange");

        // 박스에서 과일을 제대로 꺼낼 수 있을까?
        Apple ap = (Apple)aBox.get();
        Orange og = (Orange)oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
