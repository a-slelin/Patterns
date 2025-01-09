package Structure;

public class ComponentA {
    private Mediator mediator;

    public ComponentA(Mediator mediator){
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void operationA(){}
}
