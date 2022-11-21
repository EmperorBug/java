package eight;


public class ShapeMain {
    public static void main(String[] args) {
        double sumArea;

        sumArea = 0;
       Shape[] shape = {new Circle(10), new Triangle(10,10), new Rectangle(10,10)};

        for (Shape s: shape
        ) {
            sumArea+=s.getArea();
        }
        System.out.println("고객님의 넓이는 "+sumArea+" 입니다.");
    }
}
