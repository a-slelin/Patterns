package Example;

public class Tea extends CoffeeTemplate{
    @Override
    void brewCoffee() {
        System.out.println("Завариваем чай");
    }

    @Override
    void addCondiments() {
        System.out.println("Добавляем лимон");
    }
}
