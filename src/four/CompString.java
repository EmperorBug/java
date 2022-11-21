package four;

public class CompString {
    public static void main(String[] args) {
        String str1 = "Lexi";
        String str2 = "lexi";
        int com;

        if (str1.equals(str2))
            System.out.println("같");
        else
            System.out.println("다");

        com = str1.compareTo(str2);
        if (com == 0)
            System.out.println("일치");
        else if (com < 0)
            System.out.println("사전앞에 위치 문자 "+str1);
        else
            System.out.println("사전 앞 문자 :"+str2);

        if (str1.compareToIgnoreCase(str2) == 0)
            System.out.println("일");
        else
            System.out.println("불");
    }
}
