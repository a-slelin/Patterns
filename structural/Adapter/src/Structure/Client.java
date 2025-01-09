package Structure;

public class Client {
    public static void main(String[] args){
        ClientInterace interace = new Adapter();
        interace.method(new MyClass(100));
    }
}
