package lab12.designpatterns.observer.practice;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("to Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}