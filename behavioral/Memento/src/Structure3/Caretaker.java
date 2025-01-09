package Structure3;

import java.util.Stack;

public class Caretaker {
    private static Stack<Memento> history = new Stack<>();
    private static void save(Originator orig){
        history.push(orig.save());
    }
    private static void undo(Originator orig){
        history.pop().restore();
    }

    public static void main(String[] args) {
        ConcreteOriginator orig = new ConcreteOriginator("State1");
        save(orig);
        orig.print();

        orig.setState("34");
        save(orig);
        orig.print();

        orig.setState("dgfsfdg");
        undo(orig);
        orig.print();

        undo(orig);
        orig.print();
    }
}
