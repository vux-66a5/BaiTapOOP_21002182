package lab12.designpatterns.abstractfactory.pseudocode;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}