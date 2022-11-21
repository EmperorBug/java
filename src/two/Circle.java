package two;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
