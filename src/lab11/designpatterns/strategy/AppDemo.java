package lab11.designpatterns.strategy;

public class AppDemo {
    public static void main(String[] args) {
        Context context = new Context();
        int strategyId = 1;
        if (strategyId == 1) {
            context.setStrategy(new ConcreteStrategyAdd());
        }
        if (strategyId == 2) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }
        if (strategyId == 0) {
            context.setStrategy(new ConcreteStrategySubtract());
        }
        System.out.println(context.executeStrategy(5, 3));
    }
}
