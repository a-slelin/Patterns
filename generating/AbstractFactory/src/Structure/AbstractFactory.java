package Structure;

import Structure.Products.ProductA;
import Structure.Products.ProductB;

abstract public class AbstractFactory {
    abstract ProductA createProductA();
    abstract ProductB createProductB();
}
