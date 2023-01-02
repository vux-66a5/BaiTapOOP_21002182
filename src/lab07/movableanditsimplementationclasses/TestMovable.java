package lab07.movableanditsimplementationclasses;

public class TestMovable {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(1,1,2,3);
        System.out.println("Old: " + movablePoint.toString());
        movablePoint.moveUp();
        System.out.println("After move up: " + movablePoint.toString());
        System.out.println();

        Movable movableCircle = new MovableCircle(1,2,3,4,5);
        System.out.println("Old: " + movableCircle.toString());
        movableCircle.moveDown();
        System.out.println("After move down: " + movableCircle.toString());
        System.out.println();

        Movable movableRectangle = new MovableRectangle(1,7,5,3,5,5);
        System.out.println("Before: " + movableRectangle.toString());
        movableRectangle.moveLeft();
        System.out.println("After move left: " + movableRectangle.toString());
    }



}
