import Abstract_Factory.factory.GUIFactory;
import Abstract_Factory.factory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("_______________________");
        GUIFactory factory = new WindowsFactory();
        factory.createButton().paint();
        factory.createCheckbox().paint();
    }
}