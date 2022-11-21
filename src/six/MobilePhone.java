package six;

public class MobilePhone {
    protected String number;

    public MobilePhone(String number) {
        this.number = number;
    }

    public void answer() {
        System.out.println("Hi~ from"+number);
    }
}
