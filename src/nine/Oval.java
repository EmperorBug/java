package nine;

public class Oval implements Shape{
    int width;
    int height;
    double area;

    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        area = width * height * PI;
    }

    @Override
    public double getArea() {
        return area;
    }
}
