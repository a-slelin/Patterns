package Structure;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();

        Command cmd = new ConcreteCommand1(receiver, 1234);
        invoker.setCommand(cmd);
        invoker.exeCommand();

        //...
        invoker.exeCommand();
        //...
        invoker.setCommand(new ConcreteCommand2(receiver));
        invoker.exeCommand();
        //...
        invoker.exeCommand();
    }
}
