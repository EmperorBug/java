package eight;

public interface Printable {
    void print(String doc);


    default void printCMYK(String doc) {
        System.out.println("프린트");
    }
}
