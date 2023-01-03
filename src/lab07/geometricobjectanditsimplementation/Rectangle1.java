package lab07.geometricobjectanditsimplementation;

public class Rectangle1 implements GeometricObject1 {
    private double width;
    private double length;

    public Rectangle1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public String toString() {
        return "Rectangle[width=" + this.width + ",length=" + this.length + "]";
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
}
