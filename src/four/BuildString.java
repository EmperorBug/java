package four;

public class BuildString {
    public static void main(String[] args) {
        //멀티쓰레드 StringBuffer  싱글 StringBuilder
        StringBuilder stbuf = new StringBuilder();

        stbuf.append(44444);
        System.out.println(stbuf);
        stbuf.delete(0,2);
        System.out.println(stbuf);
        stbuf.replace(0,3,"ab");
        System.out.println(stbuf);
        stbuf.reverse();
        System.out.println(stbuf);
        String sub = stbuf.substring(0,2);
        System.out.println(sub);
    }
}
