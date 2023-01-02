package designpatternscollection.abstractfactory.abtractfactorypractice;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Calling draw() method of Rectangle");
    }
}