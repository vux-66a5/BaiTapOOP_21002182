package designpatternscollection.decorator.decoratorpractice2;

public class Application {
    public static void main(String[] args) {
        IceCream chocolateIceCream = new ChocolateIceCream();
        IceCream vanilaIceCream = new VanilaIceCream();
        IceCream strawberryIceCream = new StrawberryIceCream();

        IceCream honeyChocolateIceCream = new HoneyToppingDecorator(chocolateIceCream);
        IceCream nutsVanilaIceCream = new NutsToppingDecorator(vanilaIceCream);

        System.out.println(honeyChocolateIceCream.getDescription());
        System.out.println(nutsVanilaIceCream.getDescription());
    }
}
