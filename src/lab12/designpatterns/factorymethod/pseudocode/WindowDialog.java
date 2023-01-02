package lab12.designpatterns.factorymethod.pseudocode;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

