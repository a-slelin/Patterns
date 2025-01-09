package Structure;

public class ComponentB {
    private Mediator mediator;

    public ComponentB(Mediator mediator){
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void operationB(){}
}
