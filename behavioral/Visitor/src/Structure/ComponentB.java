package Structure;

public class ComponentB implements Component{

    void featureB(){
        //...
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
