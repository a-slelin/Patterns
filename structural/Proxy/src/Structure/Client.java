package Structure;

public class Client {
    public static void main(String[] args){
        Service serv = new Proxy(new RealService());

        serv.operation();
    }
}
