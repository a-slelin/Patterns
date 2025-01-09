package Example.Factories;

import Example.Products.Chairs.Chair;
import Example.Products.Sofas.Sofa;
import Example.Products.Tables.Table;

abstract public class AbstractFurnitureFactory {
    abstract public Chair createChair();
    abstract public Sofa createSofa();
    abstract public Table createTable();
}
