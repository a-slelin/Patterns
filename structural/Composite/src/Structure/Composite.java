package Structure;

import java.util.ArrayList;

public class Composite implements Component{
    private ArrayList<Component> children = new ArrayList<>();

    public void add(Component c){
        children.add(c);
    }

    public void remove(Component c){
        children.remove(c);
    }

    public ArrayList<Component> getChildren(){
        return children;
    }

    @Override
    public void execute() {
        for(Component child : children){
            child.execute();
        }
    }
}
