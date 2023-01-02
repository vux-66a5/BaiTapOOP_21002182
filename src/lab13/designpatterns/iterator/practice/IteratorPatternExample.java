package lab13.designpatterns.iterator.practice;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Iterator iterator = productCatalog.getIterator();
        while (iterator.hasNext()) {
            System.out.println("Product Name : " + iterator.next());
        }
    }
}