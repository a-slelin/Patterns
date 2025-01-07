package Structure;

public class Client {
    public static void main(String[] args){
        Context context = new Context(new ConcreteStrategy());
        context.doSomething(0);
    }
}
