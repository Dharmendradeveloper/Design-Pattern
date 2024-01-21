package Factory;

import Factory.factory.Dialog;
import Factory.factory.HTMLDialog;
import Factory.factory.WindowsDialog;

public class FactoryClient {

    public static void main(String[] args) {
        Dialog d = new HTMLDialog();
        d.showDialog();
        d = new WindowsDialog();
        d.showDialog();
    }
}
