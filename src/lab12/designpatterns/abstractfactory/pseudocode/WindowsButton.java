package lab12.designpatterns.abstractfactory.pseudocode;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}