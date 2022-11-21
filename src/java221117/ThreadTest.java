package java221117;

public class ThreadTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread1 th1 = new MyThread1 ();
        MyThread2 th2 = new MyThread2 ();
        th1.start();
        th2.start();

    }
}
