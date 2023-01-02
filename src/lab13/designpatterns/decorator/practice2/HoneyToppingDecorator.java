package lab13.designpatterns.decorator.practice2;

public class HoneyToppingDecorator extends ToppingDecorator {
    private IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }

    @Override
    public String addTopping() {
        return " with honey topping";
    }
}
