package Abstract_Factory.component.button;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Windows Button created!!");
    }
}
