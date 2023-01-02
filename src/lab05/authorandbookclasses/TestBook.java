package lab05.authorandbookclasses;

public class TestBook {
    public static void main(String[] args) {
        // We need an Author instance to create a Book instance
        Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()

        Book dummyBook = new Book("Java for dummies", ahTeck, 19.95, 99);
        System.out.println(dummyBook);  // Book's toString()

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthor());  // invoke Author's toString()
        System.out.println("author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
        System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());

        // Using an anonymous Author instance to create a Book instance
        Book anotherBook = new Book("Java for more dummies",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), // an anonymous Author's instance
                29.95);
        System.out.println(anotherBook);  // Book's toString()
        //'Java for more dummies' by Peter Lee (m) at peter@nowhere.com
    }
}