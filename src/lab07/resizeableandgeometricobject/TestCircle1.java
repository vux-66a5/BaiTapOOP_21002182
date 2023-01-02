package lab07.resizeableandgeometricobject;

public class TestCircle1 {
    public static void main(String[] args) {
        GeometricObject1 object1 = new Circle1(5);
        System.out.println(object1.toString());
        System.out.println("Area: " + object1.getArea());
        System.out.println("Perimeter: " + object1.getPerimeter());

        ResizableCircle1 object2 = new ResizableCircle1(10);
        System.out.println(object2.toString());
        object2.resize(70);
        System.out.println(object2.toString());
        System.out.println("Area: " + object2.getArea());
        System.out.println("Perimeter: " + object2.getPerimeter());


    }

}
