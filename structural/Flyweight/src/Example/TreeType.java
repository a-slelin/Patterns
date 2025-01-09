package Example;

import java.awt.*;

public class TreeType {
    String name;
    String texture;
    Color color;

    TreeType(String name, String texture, Color color){
        this.name = name;
        this.texture = texture;
        this.color = color;
    }

    void draw(double x, double y){
        //...
    }

    @Override
    public boolean equals(Object ob){
        if(ob == null || !(ob instanceof TreeType)){
            return false;
        }

        TreeType other = (TreeType) ob;

        if(this.name.equals(other.name) &&
                this.color.equals(other.color) &&
                this.texture.equals(other.texture)){
            return true;
        }
        return false;
    }

}
