package lab12.designpatterns.observer.practice;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("to Octal String: " + Integer.toOctalString(subject.getState()));
    }
}