package Structure.Building;

public class ConcreteBuilder2 implements Builder{
    private Product2 result;
    @Override
    public void reset() {
        result = new Product2();
    }

    @Override
    public void stepA() {

    }

    @Override
    public void stepB() {

    }

    @Override
    public void stepZ() {

    }

    public Product2 getResult(){
        return result;
    }
}
