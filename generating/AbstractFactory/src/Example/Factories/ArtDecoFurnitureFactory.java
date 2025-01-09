package Example.Factories;

import Example.Products.Chairs.ArtDecoChair;
import Example.Products.Chairs.Chair;
import Example.Products.Sofas.ArtDecoSofa;
import Example.Products.Sofas.Sofa;
import Example.Products.Tables.ArtDecoTable;
import Example.Products.Tables.Table;

public class ArtDecoFurnitureFactory extends AbstractFurnitureFactory{
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }
}
