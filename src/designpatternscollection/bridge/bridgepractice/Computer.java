package designpatternscollection.bridge.bridgepractice;

public abstract class Computer {
    protected OperatingSystem os;

    public Computer(OperatingSystem os) {
        this.os = os;
    }

    public abstract void startup();

    public abstract void browseInternet(String url);

    public abstract boolean canMoveComputer();
}