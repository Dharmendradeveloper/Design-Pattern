package Abstract_Factory.factory;

import Abstract_Factory.component.button.Button;
import Abstract_Factory.component.button.MacOSButton;
import Abstract_Factory.component.checkbox.Checkbox;
import Abstract_Factory.component.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
