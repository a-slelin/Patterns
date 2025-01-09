package Example.Factories;

import Example.Products.Chairs.Chair;
import Example.Products.Chairs.ModernChair;
import Example.Products.Sofas.ModernSofa;
import Example.Products.Sofas.Sofa;
import Example.Products.Tables.ModernTable;
import Example.Products.Tables.Table;

public class ModernFurnitureFactory extends AbstractFurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
