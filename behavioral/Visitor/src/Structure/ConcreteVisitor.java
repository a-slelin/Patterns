package Structure;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ComponentA comp) {
        comp.featureA();
    }

    @Override
    public void visit(ComponentB comp) {
        comp.featureB();
    }
}
