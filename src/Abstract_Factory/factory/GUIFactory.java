package Abstract_Factory.factory;

import Abstract_Factory.component.button.Button;
import Abstract_Factory.component.checkbox.Checkbox;

public interface  GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
