package designpatternscollection.factorymethod.pseudo;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

