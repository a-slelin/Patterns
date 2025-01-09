package Example;

import java.awt.*;

public class Main extends Frame {
    public void paint(Graphics g) {
        Shape circle = new Circle(100, 100, 50);
        Shape decoratedCircle = new RedBorderDecorator(circle);
        Shape doubleDecorated = new TextureDecorator(decoratedCircle);


        //doubleDecorated.draw(g);
        decoratedCircle.draw(g);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.setSize(300,300);
        m.setVisible(true);

    }
}
