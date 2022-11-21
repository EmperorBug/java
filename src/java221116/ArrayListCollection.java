package java221116;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+"\t");
        }
        System.out.println();

        list.remove(0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+"\t");
        }
        System.out.println();

//        linkedlist
        NyLinkedList list1 = new NyLinkedList();
        list1.i = 1;
        NyLinkedList list2 = new NyLinkedList();
        list1.i = 1;

        list1.myLinkedList = list2;
    }
}
