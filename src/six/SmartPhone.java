package six;

public class SmartPhone extends MobilePhone{
    private String androidVer;

    public SmartPhone(String number, String androidVer) {
        super(number);
        this.androidVer = androidVer;
    }

    public void playApp() {
        System.out.println("App is running in"+androidVer);
    }
}
