package Example;

abstract public class Shape {
    int x;
    int y;
    String color;

    public Shape(){
        x = 0;
        y = 0;
        color = "Black";
    }

    public Shape(Shape source){
        this.x = source.x;
        this.y = source.y;
        this.color = new String(source.color);
    }

    abstract public Shape Clone();
}
