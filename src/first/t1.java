package first;

public class t1 {
    public static void main(String[] args) {
//        int kor,en,ma;
//        kor = 90;
//        en = 70;
//        ma  = 80;
//        int sum = kor+en+ma;
//        double t = ((double) kor+en+ma)/3;
//        System.out.println(sum+","+t);
        //change();
        //v2();
        //v3();
        //v4();
        //v5();
        //v6();
        v7();
//        v8();
        //v9();
       // v10();


    }
    public static void change() {
        short n = 10;
        n = (short) (n+77l);
        int rate = 3;
        rate = (int) (rate*3.5);
        System.out.println(n);
        System.out.println(rate);

        n = 10;
        n += 77l;
        rate = 3;
        rate *=3.5;
        System.out.println(n);
        System.out.println(rate);
    }

    static void v2() {
        System.out.println("3>=2 :"+(3>=2));
        System.out.println("3<=2 :"+(3<=2));
        System.out.println("7.0==7 :"+(7.0==7));
        System.out.println("7.0!=7 :"+(7.0!=7));
    }

    static void v3() {
        int num = 77;
        System.out.println(num%2==0 && num%7==0 && num%11==0);
    }
    static void v4() {
        int kor,en,math;
        math = 60;
        kor = 74;
        en = 100;
        chk(math);
        chk(kor);
        chk(en);

    }
    static void chk(int n) {
            if (n >= 90) {
                System.out.println("수");
            } else if (n >= 80) {
                System.out.println("우");
            } else if (n >= 70) {
                System.out.println("미");
            } else if (n >= 60) {
                System.out.println("양");
            } else {
                System.out.println("가");
            }
        }
    static void v5() {
        int n1,n2,n3;
            n1 = 80;
            n2 = 33;
            n3 = 55;
            int big = (n1 < n2) ? (n2 < n3) ? n3 : n2 : n1;
            System.out.println(big);
    }

    static  void v6() {
        int n1,n2;
        n1 = 320;
        n2 = 500;

        System.out.println(Math.abs(n1-n2));
        System.out.println(65=='A');
    }

    //구구단
    static  void  v7() {

        for (int i = 1; i <= 9; i++) {
            if (i % 3 == 0) {
                for (int j = 1; j < 9; j++) {
                    System.out.println(i + "*" + j + "=" + i * j);
                }
            }
        }
    }
    static void v8() {
        int sum = 0;
        for (int i=1; i <= 100; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    static  void v9() {
        int n = 1;
        int cnt = 0;

        while (n<100) {
            if (n % 5 == 0 && n % 7 == 0) {
                System.out.println(n);
                cnt++;
            }
            n++;
        }
        System.out.println(cnt);
    }
    static void v10() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j<=i; j++)  {
                System.out.print("*");
            }
            System.out.println();
        }



    }

}
