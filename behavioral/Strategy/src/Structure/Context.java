package Structure;

public class Context {
    private Strategy strategy;

    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void doSomething(int data){
        //...
        strategy.execute(data);
        //...
    }
}
