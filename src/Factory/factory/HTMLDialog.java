package Factory.factory;

import Factory.button.Button;
import Factory.button.HTMLButton;

public class HTMLDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
