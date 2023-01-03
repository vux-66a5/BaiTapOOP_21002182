package lab14.designpatterns.visitor.practice1;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook businessBook) {
        System.out.println("BusinessBook info : ");
        System.out.println(businessBook.getPublisher());
        System.out.println();
    }

    @Override
    public void visit(DesignPatternBook designPatternBook) {
        System.out.println("Design pattern book info: ");
        System.out.println(designPatternBook.getResource());
        System.out.println(designPatternBook.getBestSeller());
        System.out.println();
    }

    @Override
    public void visit(JavaCoreBook javaCoreBook) {
        System.out.println("JavaCore book info: ");
        System.out.println(javaCoreBook.getResource());
        System.out.println(javaCoreBook.getFavouriteBook());
        System.out.println();
    }
}
