package seven;

public class Person {
    private String name;   // 플레이어 이름
    private int[] arr = new int[3]; //랜덤볼 저장 배열

    private int f_num; //배열에 첫번째 숫자
    private int same_num; //같은숫자인지 체크하는 변수

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void suffle() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*3+1);
            System.out.print(arr[i]+"\t");
        }
        f_num = arr[0];
    }

    public boolean chk() {
        for (int chk:arr) {

            if (f_num == chk) {
                same_num++;
            }
        }
        if (same_num == arr.length) {
            System.out.println(name+" 님이 이겼습니다.");
            return true;
        }
        same_num = 0;
        System.out.println("아쉽군요!");
        return false;
    }
}
