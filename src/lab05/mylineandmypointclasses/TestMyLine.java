package lab05.mylineandmypointclasses;

public class TestMyLine {

    public static void main(String[] args) {
        //first constructor way
        MyLine l1 = new MyLine(0, 0, 3, 4);
        System.out.println(l1);
        //second constructor way
        MyPoint p1 = new MyPoint(2, 3);
        MyPoint p2 = new MyPoint(4, 5);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2);

        System.out.println("Line 1 length: " + l1.getLength());
        System.out.println("Line 1 gradient: " + l1.getGradient());

        System.out.println("Line 2 length: " + l2.getLength());
        System.out.println("Line 2 gradient: " + l2.getGradient());


    }

}