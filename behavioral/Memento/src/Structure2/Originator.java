package Structure2;

public class Originator {
    private String state;

    public Originator(String state){
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void print(){
        System.out.println(state);
    }

    public Memento save(){
        return new ConcreteMemento(state);
    }

    public void restore(Memento m){
        ConcreteMemento memento = (ConcreteMemento)m;
        this.state = memento.getState();
    }
}
