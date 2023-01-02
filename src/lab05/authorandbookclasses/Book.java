package lab05.authorandbookclasses;

public class Book {
    private final String name;
    private final Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;  // return member author, which is an instance of the class Author
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public String toString() {
        String description = "Book" +
                "[" +
                "name = " +
                this.name +
                ", " +
                author.toString() +
                ", price = " +
                this.price +
                ", qty = " +
                this.qty +
                "]";

        return description;
    }
}
