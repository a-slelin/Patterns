package Structure;

public class Client {
    public static void main(String[] args) {
        var h1 = new HandlerA();
        //var h2 = new HandlerB();
        //var h3 = new HandlerC();
        //h1.setNext(h2);
        //h2.setNext(h3);

        h1.handle("MyRequest");
        //h1 -> h2 -> h3 ->
    }
}
