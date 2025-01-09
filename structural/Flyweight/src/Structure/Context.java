package Structure;

public class Context {
    private double uniqueState;
    private Flyweight flyweight;

    Context(double uniqueState, String repeatingState){
        this.uniqueState = uniqueState;
        this.flyweight = FlyweightFactory.getFlyweight(repeatingState);
    }

    void operation(){
        flyweight.operation(uniqueState);
    }

    @Override
    public String toString(){
        return uniqueState + flyweight.toString();
    }
}
