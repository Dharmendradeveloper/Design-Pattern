package Abstract_Factory.component.button;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacOS Button Created!!");
    }
}
