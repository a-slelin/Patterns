package Structure;

public class ComponentC {
    private Mediator mediator;

    public ComponentC(Mediator mediator){
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void operationC(){}
}
