package designpatternscollection.visitor.visitorpractice2;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
