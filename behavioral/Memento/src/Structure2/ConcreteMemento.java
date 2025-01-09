package Structure2;

public class ConcreteMemento implements Memento{
    private String state;

    public ConcreteMemento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
