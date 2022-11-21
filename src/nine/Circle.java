package nine;

public class Circle implements Shape{
    int num;
    double area;
    public Circle(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num + "";
    }

    @Override
    public void draw() {
        area = num*num*PI;
    }

    @Override
    public double getArea() {
        return area;
    }
}
