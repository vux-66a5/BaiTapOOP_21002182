package lab14.designpatterns.visitor.practice2;

public class Keyboard implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
