package first;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("AB"+'\n'+"C");
        System.out.println("AB"+'\t'+"C");
        System.out.println("AB"+'\b'+"C");
        System.out.println("AB"+'\r'+"C");

        float n1 = 3e2f;
        long n2 = 324234234l;

        int a = 3;
        int b = 4;
        double r = (double) a/(double) b;
        System.out.println(r);
    }
}
