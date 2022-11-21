package six;

public class Temporary extends Employee{
    private int time;
    private int money;

    public Temporary(String name, int age, String addr, String dept) {
        super(name, age, addr, dept);
        money = 10000;
    }


    public void setTime(int time) {
        this.time = time;
        super.setSale(time*money);
    }

    public void printInfo() {
        System.out.println("비정규직");
        System.out.println("일한 시간"+time);
        System.out.println("급여"+super.getSale());
    }
}
