package eight;

public class Sub extends Calc{

    @Override
    public void calculate() {
        System.out.println(getA()-getB());
    }

    @Override
    public int getA() {
        return super.getA();
    }

    @Override
    public void setA(int a) {
        super.setA(a);
    }

    @Override
    public int getB() {
        return super.getB();
    }

    @Override
    public void setB(int b) {
        super.setB(b);
    }
}
