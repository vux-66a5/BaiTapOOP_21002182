package designpatternscollection.abstractfactory.abtractfactorypractice;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Calling draw() method of RoundedRectangle");
    }
}