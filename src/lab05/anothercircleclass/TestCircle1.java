package lab05.anothercircleclass;

public class TestCircle1 {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        Circle1 c2 = new Circle1(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle1 c4 = new Circle1();
        c4.setRadius(5.5);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is: " + c4.getColor());

        //can't println(void)
        //System.out.println(c4.setRadius(4.4));
        Circle1 c5 = new Circle1(5.5);
        System.out.println("c5: " + c5);

        Circle1 c6 = new Circle1(6.6);
        System.out.println("c6: " + c6);
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6);
    }
}
