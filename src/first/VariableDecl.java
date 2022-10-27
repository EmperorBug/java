package first;

public class VariableDecl {
    public static void main(String[] args) {
        short num1,num2;
        short result;
        num1 = 15;
        num2 = 22;
        result = (short) (num1+num2); //jvm은 기본적으로 32비트이기 때문에 int로 변경하여 메모리에 올려야함
        System.out.println(result);
    }
}
