package lab05.anothercircleclass;

public class Circle1 {
    private double radius;
    private String color;

    public Circle1() {
        radius = 1.0;
        color = "red";
    }

    public Circle1(double newRadius) {
        radius = newRadius;
        color = "red";
    }

    public Circle1(double newRadius, String newColor) {
        radius = newRadius;
        color = newColor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        String description = "Circle" +
                "[" +
                "radius=" +
                this.radius +
                "]";

        return description;
    }
}
