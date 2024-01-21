package Factory.factory;

import Factory.button.Button;
import Factory.button.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
