package java221117;

import java.util.LinkedList;
import java.util.Queue;

//큐는 FIFO(FirstInFirstOut)
//que.peek() ===> 큐에 있는 다음꺼 확인
//que.offer() ===> que에 넣기
//que.poll() ===> que에서 제일 첫번째꺼 꺼내기
public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> que =  new LinkedList<>();
        que.offer("BOx");
        que.offer("Toy");
        que.offer("Robot");

        System.out.println(que.peek());

        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println("next : " + que.peek() );

        System.out.println(que.poll());
    }
}
