package lab14.designpatterns.visitor.practice1;

public class DesignPatternBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "DesignPatternBook.java" + " from https://gpcoder.com/4813-huong-dan-java-design-pattern-visitor/";
    }

    public String getBestSeller() {
        return "The best Seller of design pattern book";
    }
}
