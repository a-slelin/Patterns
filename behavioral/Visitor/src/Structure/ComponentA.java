package Structure;

public class ComponentA implements Component{

    public void featureA(){
        //...
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
