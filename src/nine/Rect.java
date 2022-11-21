package nine;

public class Rect implements Shape{
    int width;
    int height;
    int area;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        area = width*height;
    }

    @Override
    public double getArea() {
        return area;
    }
}
