package lab05.mytriangleandmypointclasses;

public class TestMyTriangle {

    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 4, 1, 1, 5);
        MyTriangle t2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(0, 2), new MyPoint(2, 0));

        System.out.println("Triangle " + t1 + " is " + t1.getType() + " and has perimeter " + t1.getPerimeter());
        System.out.println("Triangle " + t2 + " is " + t2.getType() + " and has perimeter " + t2.getPerimeter());
    }
}   