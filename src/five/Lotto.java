package five;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto_arr = new int[6];
        int temp = 0;
        for (int i = 0; i < lotto_arr.length; i++) {
            lotto_arr[i] = (int)(Math.random()*45)+1;
            for (int j = 0 ; j <=i; j++) {
                if (lotto_arr[j] == temp) {
                    i--;
                    break;

                }
            }
        }

        for (int i = 0; i < lotto_arr.length; i++) {

            if (i != lotto_arr.length-1) {
                System.out.print(lotto_arr[i]+",");
            }
            else
                System.out.println(lotto_arr[i]);
        }
    }
}
