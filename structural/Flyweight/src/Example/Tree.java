package Example;

public class Tree {
    private double x;
    private double y;
    private TreeType type;

    Tree(double x, double y, TreeType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    void draw(){
        type.draw(x, y);
    }
}
