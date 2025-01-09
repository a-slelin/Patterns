package Structure;

public class ConcreteDecorator1 extends BaseDecorator{

    ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }

    public void extra(){
        //...
    }
}
