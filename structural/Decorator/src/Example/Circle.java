package Example;

import java.awt.*;

public class Circle implements Shape{
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}
