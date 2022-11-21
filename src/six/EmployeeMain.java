package six;

public class EmployeeMain {
    public static void main(String[] args) {
//        Employee em = new Employee("kim",20,"서울","사장");
//        em.printInfo();

        Regular regular = new Regular("kim",20,"서울","사장");
        regular.setSale(1000000);
        regular.printInfo();

        Temporary t = new Temporary("장보고", 25, "인천", "경리부");

        t.setTime(120);
        t.printInfo();
    }
}
