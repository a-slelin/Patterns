package Structure;

import Structure.Building.ConcreteBuilder1;
import Structure.Building.ConcreteBuilder2;
import Structure.Building.Product1;
import Structure.Building.Product2;

public class Client {
    public static void main(String[] args){
        ConcreteBuilder2 builder = new ConcreteBuilder2();
        Director director = new Director(builder);
        director.make("first");
        Product2 product = builder.getResult();

        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        new Director(builder1).make("second");
        Product1 product1 = builder1.getResult();
    }
}
