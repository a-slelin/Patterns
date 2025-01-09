package Structure;

public class ConcretePrototype implements Prototype{
    private int field1;

    public ConcretePrototype(){
        this.field1 = 0;
    }

    public ConcretePrototype(int field1){
        this.field1 = field1;
    }

    public ConcretePrototype(ConcretePrototype prototype){
        this.field1 = prototype.field1;
    }

    @Override
    public ConcretePrototype clone() {
        return new ConcretePrototype(this);
    }

    public void Info(){
        System.out.println(field1);
    }
}
