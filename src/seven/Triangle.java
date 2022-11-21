package seven;

public class Triangle extends Shape{
    private int width, height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height / 2.0;
    }
}
