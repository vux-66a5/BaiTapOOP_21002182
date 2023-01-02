package lab05.authorandbookclassesyourturn;

public class Book3 {
    private final String isbn;
    private final String name;
    private final Author author;
    private double price;
    private int qty;

    public Book3(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public Book3(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
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

    public String getAuthorName() {
        return author.getName();
    }

    public String toString() {
        String description = "Book[isbn = " +
                this.isbn +
                ", name = " +
                this.name +
                "," +
                author.toString();
        return description;
    }
}
