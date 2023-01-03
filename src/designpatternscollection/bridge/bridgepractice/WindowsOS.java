package designpatternscollection.bridge.bridgepractice;

public class WindowsOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("Starting up Windows");
    }

    @Override
    public void loadUrl(String url) {
        System.out.println("Opening Microsoft Edge");
        System.out.println("Loading " + url + " in Microsoft Edge");
    }
}