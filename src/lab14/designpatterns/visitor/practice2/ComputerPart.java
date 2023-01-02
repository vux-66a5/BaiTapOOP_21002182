package lab14.designpatterns.visitor.practice2;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
