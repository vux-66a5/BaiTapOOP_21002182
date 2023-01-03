package designpatternscollection.singleton;

public class SingletonExampleBall {
    private static SingletonExampleBall ball;
    private String color;

    private SingletonExampleBall(String color) {
        this.color = color;
    }

    public static SingletonExampleBall getInstance(String color) {
        if (ball == null) {
            ball = new SingletonExampleBall(color);
        }
        return ball;
    }

}
