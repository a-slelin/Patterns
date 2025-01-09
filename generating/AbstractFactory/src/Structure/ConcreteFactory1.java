package Structure;

import Structure.Products.*;

public class ConcreteFactory1 extends AbstractFactory{
    @Override
    ProductA createProductA() {
        //doing whatever...
        return new ConcreteProductA1();
    }

    @Override
    ProductB createProductB() {
        //doing whatever...
        return new ConcreteProductB1();
    }
}
