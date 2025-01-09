package Structure;

public class Client {
    public static void main(String[] args){
        Abstraction abs = new Abstraction(new ConcreteImplementation1());

        System.out.println(abs.feature1(56.4));
        System.out.println(abs.feature2("sldkfj"));
    }
}
