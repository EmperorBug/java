package java221116;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        // 인스턴스 저장
        list.add(10);  list.add(20);
        list.add(30);

        // 반복자 획득
        int n;
        for (Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
            n = itr.next();
            System.out.print(n+"\t");
        }
        System.out.println();

    }
}
