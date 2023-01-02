package lab11.designpatterns.singleton;

public class SingletonExampleBallTest {
    public static void main(String[] args) {
        SingletonExampleBall ball1 = SingletonExampleBall.getInstance("Red");
        System.out.println(ball1);
        SingletonExampleBall ball2 = SingletonExampleBall.getInstance("Blue");
        System.out.println(ball2);
    }
}
