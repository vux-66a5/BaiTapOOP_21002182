package lab05.mycircleandmypointclasses;

public class TestMyCircle {

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(3, 0, 3);
        MyCircle c2 = new MyCircle(new MyPoint(1, 1), 4);

        System.out.println("Circle c1: " + c1);
        System.out.println("Circle c2: " + c2);

        c1.setRadius(5);
        System.out.println("Radius of circle c1 now is " + c1.getRadius());

        c2.setCenterXY(3, 3);
        System.out.println("Center of circle c2 now is " + c2.getCenter());

        c1.setCenter(new MyPoint(4, 4));
        System.out.println("Center of circle c1 now is " + c1.getCenter());


        System.out.printf("%s%.2f \n", "Area of circle c1 is: ", c1.getArea());
        System.out.printf("%s%.2f \n", "Circumference of circle c1 is: ", c1.getCircumference());
        System.out.printf("%s%.2f \n", "Area of circle c2 is: ", c2.getArea());
        System.out.printf("%s%.2f \n", "Circumference of circle c2 is: ", c2.getCircumference());
        System.out.printf("%s%.2f \n", "Distance between centers is: ", c1.distance(c2));
    }
}   