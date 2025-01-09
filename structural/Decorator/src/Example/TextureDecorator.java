package Example;

import java.awt.*;

public class TextureDecorator extends ShapeDecorator{
    public TextureDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 200, 200); //Пример: рисуем текстуру размером 200x200
        super.draw(g);
    }
}
