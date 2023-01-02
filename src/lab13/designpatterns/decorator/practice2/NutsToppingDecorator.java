package lab13.designpatterns.decorator.practice2;

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
