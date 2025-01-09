package Structure;

public class Client {
    public static void main(String[] args){
        //Когда-то было создано и мы его не видим...
        var value = new ConcretePrototype(100);
        var value2 = new SubClassPrototype(value, "Test");

        //Хотим получить копию value
        var copy = value.clone();
        var copy2 = value2.clone();

        value.Info();
        copy.Info();
        System.out.println();

        value2.Info();
        copy2.Info();
    }
}
