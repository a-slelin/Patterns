package Example;

import java.awt.Graphics;

abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(Graphics g) {
        shape.draw(g); //Вызов метода отрисовки базового объекта
    }
}