package Structure;

public class BaseDecorator implements Component{
    private Component component;

    BaseDecorator(Component component){
        this.component = component;
    }

    @Override
    public void execute() {
        component.execute();
    }
}
