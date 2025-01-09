package Example;

public class Espresso extends CoffeeTemplate{
    @Override
    void brewCoffee() {
        System.out.println("Завариваем эспрессо");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавляем сахар");
    }
}
