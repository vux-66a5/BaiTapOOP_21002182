package designpatternscollection.observer.observerpractice;

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