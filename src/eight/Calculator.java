package eight;

//public class Calculator implements ICalculator{
//    @Override
//    public int add(int num1, int num2) {
//        return num1+num2;
//    }
//
//    @Override
//    public int sub(int num1, int num2) {
//        return num1-num2;
//    }
//
//    @Override
//    public int multi(int num1, int num2) {
//        return num1*num2;
//    }
//
//    @Override
//    public int div(int num1, int num2) {
//        return num1/num2;
//    }
//}

//추상클래스 vs 인터페이스
//보통은 인터페이스 씀
//하지만 인터페이스에는 private이 못붙음 (기본적으로 public)
//private써야하는경우 추상클래스 사용
public class Calculator extends ACalculator {
    public Calculator(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int add() {
        return getNum1()+getNum2();
    }

    @Override
    int sub() {
        return getNum1()-getNum2();
    }

    @Override
    int multi() {
        return getNum1()*getNum2();
    }

    @Override
    int div() {
        return getNum1()/getNum2();
    }
}