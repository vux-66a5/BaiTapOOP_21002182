package lab14.designpatterns.bridge.practice;

public class Client {
    public static void main(String[] args) {
        Computer myComputer = new PC(new WindowsOS());
        myComputer.startup();
        if (myComputer.canMoveComputer())
            System.out.println("Moving computer to a new location.");

        myComputer.browseInternet("https://google.com");
    }
}