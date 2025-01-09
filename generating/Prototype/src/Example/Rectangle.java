package Example;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(){
        super();
        width = height = 0;
    }

    public Rectangle(Rectangle source){
        super(source);
        if(source != null){
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Shape Clone() {
        return new Rectangle(this);
    }
}
