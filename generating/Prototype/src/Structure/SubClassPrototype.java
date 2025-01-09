package Structure;

public class SubClassPrototype extends ConcretePrototype{
    private String field2;

    public SubClassPrototype(){
        super();
        this.field2 = null;
    }

    public SubClassPrototype(int field1){
        super(field1);
        this.field2 = null;
    }

    public SubClassPrototype(String field2){
        super();
        this.field2 = field2;
    }

    public SubClassPrototype(int field1, String field2){
        super(field1);
        this.field2 = field2;
    }

    public SubClassPrototype(ConcretePrototype prototype){
        super(prototype);
        this.field2 = null;
    }

    public SubClassPrototype(ConcretePrototype prototype, String field2){
        super(prototype);
        this.field2 = field2;
    }

    public SubClassPrototype(SubClassPrototype prototype){
        super(prototype);
        this.field2 = prototype.field2;
    }

    @Override
    public SubClassPrototype clone(){
        return new SubClassPrototype(this);
    }

    @Override
    public void Info(){
        super.Info();
        System.out.println(field2);
    }
}
