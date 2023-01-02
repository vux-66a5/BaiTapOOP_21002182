package lab05.myrectangleandmypointclasses;

public class TestMyRectangle {
    public static void main(String[] args) {
        //2 ways constructor
        MyRectangle rectangle1 = new MyRectangle(1, 3, 3, 0);
        MyRectangle rectangle2 = new MyRectangle(new MyPoint(1, 3), new MyPoint(3, 0));
        //test public method
        System.out.println("rectangle 1: " + rectangle1);
        System.out.println();
        System.out.println("rectangle 1: " + rectangle2);
        System.out.println();
        System.out.println("Area of rectangle 1: " + rectangle1.getArea());
        System.out.println("Area of rectangle 2: " + rectangle2.getArea());
        System.out.println();
        System.out.println("Perimeter of rectangle 1: " + rectangle1.getPerimeter());
        System.out.println("Perimeter of rectangle 2: " + rectangle2.getPerimeter());
    }


}
