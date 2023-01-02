package lab14.designpatterns.visitor.pseudocode;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor v);
}
