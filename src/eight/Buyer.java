package eight;

public class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];

    int i = 0;      //배열 인덱스

    void buy(Product p) {
        if (p.getPrice() > money) {
            System.out.println("잔액이 부족하여"+p.toString()+"을/를 살수 없습니다.");
        }
        else {
            money -= p.getPrice();
            add(p);
        }
    }

    void add(Product p ) {
        if (cart.length-1 <= i) {
            Product[] newCart = cart;
            cart = new Product[cart.length*2];
            for (int j = 0; j < newCart.length; j++) {
                cart[j] = newCart[j];
            }

        }
        cart[i] = p;
        i++;
    }

    void summary() {
        int sum = 0;
        String summry = "";
        for (int j = 0; j <= i-1; j++) {
            summry+=cart[j].toString()+",";
            sum += cart[j].getPrice();
        }
        System.out.println("구입한 물건 : "+summry);
        System.out.println("사용한 금액 : "+sum);
        System.out.println("남은 금액 : "+money);
    }
}
