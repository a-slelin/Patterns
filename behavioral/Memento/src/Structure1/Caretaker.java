package Structure1;

import java.util.Stack;

public class Caretaker {
    private int num = 1;
    private Originator orig;
    private Stack<Originator.Memento> history;

    public Caretaker(Originator orig){
        this.orig = orig;
        history = new Stack<>();
    }

    public void Do(){
        orig.setState("State" + (++num));
        history.push(orig.save());
    }

    public void Undo(){
        orig.restore(history.pop());
    }

    public static void main(String[] args) {
        Originator originator = new Originator("State1");
        Caretaker caretaker = new Caretaker(originator);
        originator.print();

        caretaker.Do();
        originator.print();
        caretaker.Do();
        originator.print();
        caretaker.Do();
        originator.print();

        caretaker.Undo();
        originator.print();
        caretaker.Undo();
        originator.print();
    }
}
