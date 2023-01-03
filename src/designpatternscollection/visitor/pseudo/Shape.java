package designpatternscollection.visitor.pseudo;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor v);
}
