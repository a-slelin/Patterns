package Example;

public class Adapter implements Shape{
    private LegacyRectangle value;

    Adapter(LegacyRectangle value){
        this.value = value;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = x1;
        int y = y1;
        int width = x2 - x1;
        int height = y2 - y1;
        value.draw(x, y, width, height);
    }
}
