package Structure.Building;

public class ConcreteBuilder1 implements Builder{
    private Product1 result;
    @Override
    public void reset() {
        result = new Product1();
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

    public Product1 getResult(){
        return result;
    }
}
