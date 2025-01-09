package Example;

import java.awt.*;
import java.util.ArrayList;

public class Forest {
    public ArrayList<Tree> trees;

    void plantTree(double x, double y, String name, Color color, String texture){
        TreeType type = TreeFactory.getTreeType(name, texture, color);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    void draw(){
        for(Tree tree : trees){
            tree.draw();
        }
    }
}
