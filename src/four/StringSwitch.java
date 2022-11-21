package four;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";  //two가 상수

        //상수의 메모리주소값을 비교하므로 바교가능
        switch (str) {
            case "one" :
                System.out.println("Asdf");
                break;
            case "two" :
                System.out.println("two");
                break;
        }
    }
}
