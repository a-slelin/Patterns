package Structure;

public class ConcreteCommand1 implements Command{
    private Receiver receiver;
    private int params;

    public ConcreteCommand1(Receiver receiver, int params){
        this.receiver = receiver;
        this.params = params;
    }

    @Override
    public void execute() {
        receiver.operation(params);
    }
}
