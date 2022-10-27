package first;

import java.math.BigDecimal;

public class FirstJavaProgram {
    public static void main(String[] args) {

        System.out.println("Welcome to Java");
        System.out.println(5<<5);
        long num = 9223372036854775807l; //2^63
        int num0 = 2147483647; //2^31
        short num1 = 32767; //2^15
        byte num2 = 127;    //2^7
        boolean t;
        float s1=1.111f;   // 1.4*10^-45 ~ 3.4*10^38
        double s2 = 134.124124; //4.94*10^-324 ~ 1.79*10*10^308
        char cha = 0x112c;
        String s = "asdf";
        System.out.println(cha);
        System.out.println(Integer.toBinaryString(-5));
    }
}
