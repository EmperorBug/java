package java221116;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//자바에서 native붙은 함수는 다른언어에서 가져다 쓰기 위하여 사용함
public class SetCollectionFeature {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Toy1");
        set.add("Toy2");
        set.add("Toy3");
        set.add("Toy4");

        System.out.println("인스턴스 수 "+set.size());

        for (Iterator<String> itr = set.iterator(); itr.hasNext();)
            System.out.println(itr.next() +"\t");
        System.out.println();

        for (String s : set)
            System.out.println(s+"\t");
        System.out.println();

        ///////////////////////////
        //add시 해쉬코드 호출 (분류를 위해서)
        Set<Integer> lSet = new HashSet<>();
        while (lSet.size() <= 6) {
            int num = (int)(Math.random()*45+1);
            lSet.add(num);

        }
        Iterator<Integer> itr = lSet.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

    }

}
