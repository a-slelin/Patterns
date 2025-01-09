package Structure3;

public class ConcreteOriginator implements Originator{
    private String state;

    public ConcreteOriginator(String state){
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public Memento save() {
        return new ConcreteMemento(this, state);
    }

    public void print(){
        System.out.println(state);
    }
}
