package lab12.designpatterns.factorymethod.pseudocode;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
