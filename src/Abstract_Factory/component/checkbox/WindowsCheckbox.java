package Abstract_Factory.component.checkbox;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Windows checkbox created!!");
    }
}
