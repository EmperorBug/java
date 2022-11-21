package java221117;

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(45,"Brown");
        map.put(37,"James");
        map.put(23,"Matin");

        System.out.println(map.get(37));
        System.out.println(map.get(23));
        System.out.println(map.get(45));

        map.put(37,"hong");     //기존 37번이 덮어씌어짐
        System.out.println(map.get(37));

        map.remove(37);
        System.out.println(map.get(37));
    }
}
