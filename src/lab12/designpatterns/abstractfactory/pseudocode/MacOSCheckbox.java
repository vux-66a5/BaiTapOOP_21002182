package lab12.designpatterns.abstractfactory.pseudocode;


public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}