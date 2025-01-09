package Structure;

public class Client {
    public static void main(String[] args) {
        State initial = new ConcreteState();
        Context context = new Context(initial);
        context.doThat();
    }
}
