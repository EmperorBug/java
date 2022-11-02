package first;

public class t2 {
    public static void main(String[] args) {
        grade(100,95,100);
        getHap(123);
    }

    static void grade(int num1, int num2, int num3) {

        if (avg(num1, num2, num3) >= 90) {
            System.out.println("수");
        }
        else System.out.println("가");
    }

    static int avg(int num1, int num2, int num3) {
        return (num1+num2+num3)/3;
    }

    static void getHap(int num) {
        int sum = 0;
        String s = "";
        for (int i = 1; i <= num; i++) {
            sum+=i;
            if (i == num) {
                s+=i+"=";
            }
            else {
                s+=i+"+";
            }

        }
        System.out.println(s+sum);
    }
}
