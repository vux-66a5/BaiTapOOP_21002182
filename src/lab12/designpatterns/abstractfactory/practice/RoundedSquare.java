package lab12.designpatterns.abstractfactory.practice;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Calling draw() method of RoundedSquare");
    }
}