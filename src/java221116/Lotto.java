package java221116;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lotto {
    static int[][] arr = new int[4][6];
    public static void main(String[] args) {
        int mount = 4;
        int num;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                num = (int)(Math.random()*45+1);
                 if (check(num)) {
                     arr[i][j] = num;
                 }
                 else j--;
            }

        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        sort();
    }

    static boolean check(int num) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static void sort() {


        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
