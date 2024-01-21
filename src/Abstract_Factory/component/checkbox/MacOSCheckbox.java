package Abstract_Factory.component.checkbox;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("MacOS checkbox created!!");
    }
}
