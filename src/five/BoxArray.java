package five;

import two.Circle;

public class BoxArray {
    public static void main(String[] args) {
        for (String arg: args) {
            System.out.println(arg);
        }
        Circle[] arrCircle = {new Circle(10), new Circle(20)};
        double sumArea = sumCircles(arrCircle);
        int[] arrLotto = makeLotto();
        for ( int num : arrLotto) {
            System.out.println(num);
        }

        for (Circle circle : arrCircle) {
            System.out.println(circle.getArea());
        }

        System.out.println(sumArea);
    }

    static int[] makeLotto() {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*45)+1;
        }
        return arr;
    }

    static double sumCircles(Circle[] circles) {
        double sum = 0;

        for (int i = 0; i < circles.length; i++) {
            sum+=circles[i].getArea();
        }
        return sum;
    }
}
