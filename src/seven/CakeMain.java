package seven;


public class CakeMain {
    public static void main(String[] args) {
        CheeseCake ca1 = new CheeseCake();
        Cake ca2    =   new CheeseCake();

        Cake ca3    =   new CheeseCake();
        CheeseCake ca4  =   (CheeseCake) ca3;    //형변환 안하면 에러 ca3메모리에 cheeseCake가 있어서 형변환 가능

        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy();
        c2.yummy();

    }
}
