package Factory.factory;

import Factory.button.Button;

public abstract class Dialog {

    public void showDialog(){
        Button button = createButton();
        button.draw();
    }

    abstract Button createButton();
}
