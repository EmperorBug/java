package eight;

public class Add extends Calc{
    @Override
    public void calculate() {
        System.out.println(getA()+getB());
    }

    @Override
    public int getA() {
        return super.getA();
    }


    @Override
    public int getB() {
        return super.getB();
    }

}
