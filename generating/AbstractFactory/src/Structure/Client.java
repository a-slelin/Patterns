package Structure;

import Structure.Products.*;

public class Client {
    private AbstractFactory factory;

    Client(AbstractFactory factory){
        this.factory = factory;
    }

    public static void main(String[] args){
        Client cl = new Client(new ConcreteFactory2());

        ProductA pa = cl.factory.createProductA();
        ProductB pb = cl.factory.createProductB();

        pa.MethodProductA();
        pb.MethodProductB();
    }

}
