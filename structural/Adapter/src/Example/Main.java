package Example;

public class Main {
    public static void main(String[] args){
        // Создаем объект старого API
        LegacyRectangle legacyRect = new LegacyRectangle();

        // Создаем адаптер
        Shape adapter = new Adapter(legacyRect);

        // Используем адаптер в новом API
        adapter.draw(10, 10, 50, 50); // Рисует прямоугольник с координатами (10,10) и (50,50)
    }
}
