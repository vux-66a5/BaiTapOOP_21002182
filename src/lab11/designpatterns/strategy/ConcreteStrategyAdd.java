package lab11.designpatterns.strategy;

public class ConcreteStrategyAdd implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
