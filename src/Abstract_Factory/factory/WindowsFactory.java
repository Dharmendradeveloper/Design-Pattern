package Abstract_Factory.factory;

import Abstract_Factory.component.button.Button;
import Abstract_Factory.component.button.WindowsButton;
import Abstract_Factory.component.checkbox.Checkbox;
import Abstract_Factory.component.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
