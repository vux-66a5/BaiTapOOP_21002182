package designpatternscollection.decorator.decoratorpractice2;

public class NutsToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " with nuts topping";
    }
}
