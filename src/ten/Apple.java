package ten;

public class Apple implements Fruit{
    @Override
    public String toString() {
        return "I am an apple";
    }

    @Override
    public void print() {
        System.out.println("나는 사과다");
    }
}
