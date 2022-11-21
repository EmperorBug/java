package six;

public class Person {
    private String name;

    private int[] arr = new int[3];
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  boolean getRandom() {
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int)(Math.random()*3+1);
            System.out.print(arr[i]+"\t");

        }
        if ((arr[0] == arr[1]) && (arr[0] == arr[2])) {
                return true;
        }

        return false;
    }
}
