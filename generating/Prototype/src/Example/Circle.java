package Example;

public class Circle extends Shape{
    double radius;
    public Circle(){
        super();
        radius = 0;
    }

    public Circle(Circle source){
        super(source);
        if(source != null){
            this.radius = source.radius;
        }
    }

    @Override
    public Shape Clone() {
        return new Circle(this);
    }
}
