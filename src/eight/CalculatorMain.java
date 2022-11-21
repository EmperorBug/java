package eight;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal =new Calculator(5,5);

        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.multi());
        System.out.println(cal.div());
    }
}
