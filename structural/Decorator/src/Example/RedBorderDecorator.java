package Example;

import java.awt.*;

public class RedBorderDecorator extends ShapeDecorator{
    public RedBorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(0,0,200,200); //Пример: рисуем рамку размером 200x200.  Надо будет корректировать по размеру объекта
        super.draw(g);
    }
}
