package lab07.resizeableandgeometricobject;

public class Circle1 implements GeometricObject1 {
    protected double radius;
    public Circle1(double radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
