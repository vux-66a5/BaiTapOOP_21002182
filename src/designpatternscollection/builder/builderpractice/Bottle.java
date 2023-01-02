package designpatternscollection.builder.builderpractice;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}