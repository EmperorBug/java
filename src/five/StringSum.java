package five;

public class StringSum {
    public static void main(String[] args) {
        String[] str = new String[7];
        int sum = 0;
        str[0] = new String("Java");
        str[1] = new String("System");
        str[2] = new String("Compiler");
        str[3] = new String("Park");
        str[4] = new String("Tree");
        str[5] = new String("Dinner");
        str[6] = new String("Brunch cafe");

        for (int i = 0; i <str.length; i++) {
            sum+=str[i].length();
        }
        System.out.println(sum);
    }
}
