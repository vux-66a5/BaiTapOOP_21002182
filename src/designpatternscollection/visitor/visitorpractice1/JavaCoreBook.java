package designpatternscollection.visitor.visitorpractice1;

public class JavaCoreBook implements ProgramingBook {


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "JavaCoreBook.java" + " from https://gpcoder.com/4813-huong-dan-java-design-pattern-visitor/";
    }

    public String getFavouriteBook() {
        return "The most favourite book of java core";
    }
}
