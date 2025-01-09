package Structure;

public class Client {
    public static void main(String[] args) {
        Component component = new ComponentA();
        component.accept(new ConcreteVisitor());
    }
}
