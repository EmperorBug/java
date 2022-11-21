package six;

public class Employee {
    private String name;
    private int age;
    private String addr;
    private String dept;
    private int sale;

    public Employee(String name, int age, String addr, String dept) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.dept = dept;
    }

    protected void printInfo() {
        System.out.println("이름 : "+name+", 나이 : "+age+", 주소 : "+addr+", 부서 : "+dept);
    }

    protected void setSale(int sale) {
        this.sale = sale;
    }

    protected int getSale() {
        return sale;
    }
}
