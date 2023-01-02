package lab07.shapeanditsconcretesubclasses;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        super();
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + this.width + ",length=" + this.length + "]";
    }
}
