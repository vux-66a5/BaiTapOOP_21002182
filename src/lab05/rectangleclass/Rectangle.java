package lab05.rectangleclass;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float newLength, float newWidth) {
        this.length = newLength;
        this.width = newWidth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public String toString() {
        String description = "Rectangle" +
                "[" +
                "length = " +
                this.length +
                ", " +
                "width = " +
                this.width +
                "]";

        return description;

    }
}
