package lab12.designpatterns.observer.practice;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("to Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}