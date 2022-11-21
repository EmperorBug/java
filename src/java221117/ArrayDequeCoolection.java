package java221117;

import java.util.ArrayDeque;
import java.util.Deque;

//자바에서 제공하는 스택은 메모리?문제가있어서 Deque로 구현함
public class ArrayDequeCoolection {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>();

        deq.offerFirst("1.box");
        deq.offerFirst("2.Toy");
        deq.offerFirst("3.Robot");

        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
    }
}
