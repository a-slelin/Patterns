package Structure;

public class ComponentD {
    private Mediator mediator;

    public ComponentD(Mediator mediator){
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void operationD(){}
}
