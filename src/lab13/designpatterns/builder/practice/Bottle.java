package lab13.designpatterns.builder.practice;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}