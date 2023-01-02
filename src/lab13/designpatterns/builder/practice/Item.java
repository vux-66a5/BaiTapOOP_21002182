package lab13.designpatterns.builder.practice;

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}