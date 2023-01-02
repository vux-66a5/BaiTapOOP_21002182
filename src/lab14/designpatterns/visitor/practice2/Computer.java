package lab14.designpatterns.visitor.practice2;

public class Computer implements ComputerPart{
    ComputerPart[] partsOfComputer;

    public Computer() {
        partsOfComputer = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < partsOfComputer.length; i++) {
            partsOfComputer[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
