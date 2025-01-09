package Example.Factories;

import Example.Products.Chairs.Chair;
import Example.Products.Chairs.VictorianChair;
import Example.Products.Sofas.Sofa;
import Example.Products.Sofas.VictorianSofa;
import Example.Products.Tables.Table;
import Example.Products.Tables.VictorianTable;

public class VictorianFurnitureFactory extends AbstractFurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
