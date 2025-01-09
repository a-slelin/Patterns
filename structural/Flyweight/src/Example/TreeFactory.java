package Example;

import Structure.Flyweight;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

public class TreeFactory {
    private static ArrayList<TreeType> cashe = new ArrayList<>();
    public static TreeType getTreeType(String name, String texture, Color color){
        TreeType type;
        for(int i = 0; i < cashe.size(); ++i){
            type = cashe.get(i);
            if(type.name.equals(name)
            && type.texture.equals(texture)
            && type.color.equals(color)){
                return type;
            }
        }

        type = new TreeType(name, texture, color);
        cashe.add(type);
        return type;
    }
}
