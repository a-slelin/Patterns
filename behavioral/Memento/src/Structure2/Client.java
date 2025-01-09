package Structure2;

import java.util.Stack;

public class Client {
    private int num = 1;
    private Originator orig;
    private Stack<Memento> history;

    public Client(Originator orig){
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
        Client client = new Client(originator);
        originator.print();

        client.Do();
        originator.print();
        client.Do();
        originator.print();
        client.Do();
        originator.print();

        client.Undo();
        originator.print();
        client.Undo();
        originator.print();
    }
}
