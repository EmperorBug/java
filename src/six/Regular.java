package six;

public class Regular extends Employee{
    public Regular(String name, int age, String addr, String dept) {
        super(name, age, addr, dept);
    }

    public void setSale(int sale) {
        super.setSale(sale);
    }

    public void printInfo() {
        System.out.println("정규직, 월급 : "+super.getSale());
    }
}
