package Example;

import java.util.ArrayList;

public class Application {
    private static ArrayList<Shape> shapes = new ArrayList<>();

    public Application(){
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        shapes.add(circle);

        Shape otherCircle = circle.Clone();
        shapes.add(otherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);
    }

    public static void main(String[] args){
        ArrayList<Shape> ShapeCopy = new ArrayList<>();

        for(Shape s : shapes){
            ShapeCopy.add(s.Clone());
        }
    }
}
