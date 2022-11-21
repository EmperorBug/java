package five;

public class BoxMain {
    public static void main(String[] args) {
        Box[] arr =new Box[5];
        arr[0]  =   new Box(101,"Coffee");
        arr[1]  =   new Box(202,"Coffee2");
        arr[2]  =   new Box(303,"Coffee3");
        arr[3]  =   new Box(404,"Coffee4");
        arr[4]  =   new Box(505,"Coffee5");

        for (Box e : arr) {
            if (e.getBoxNum() == 505) {
                System.out.println(e); //println은 toString호출 -> box에서 toString 오버라이딩하면 주소값이 아닌 원하는값 호출가
            }
        }
    }
}
