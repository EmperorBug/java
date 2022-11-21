package five;

public class PartiallyFilledArray {

    public static void main(String[] args) {
        int[][] arr2 = new int[4][4];
        String str = "abcde";
        String newStr = "";
        for (int i = 0; i<str.length(); i++) {
            newStr += str.charAt(str.length()-i-1);

        }
        System.out.println(newStr);
        int num = 16;
//        int[][] arr = {
//                {11},
//                {22,33},
//                {44,55,66}
//        };
//
//        for (int i = 0; i <arr.length; i++) {
//            for (int j = 0 ; j <arr[i].length; j++) {
//                System.out.println(arr[i]);
//            }
//        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <arr2.length; j++) {
                arr2[i][j] = num;
                num--;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <arr2.length; j++) {
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
