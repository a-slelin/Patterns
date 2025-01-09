package Structure;

import Structure.Products.*;

public class ConcreteFactory2 extends AbstractFactory{
    @Override
    ProductA createProductA() {
        //doing whatever...
        return new ConcreteProductA2();
    }

    @Override
    ProductB createProductB() {
        //doing whatever...
        return new ConcreteProductB2();
    }
}
