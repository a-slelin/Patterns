package Example;

abstract public class CoffeeTemplate {
    final void makeCoffee(){
        boilWater();
        brewCoffee();
        pourInCup();
        addCondiments();
    }

    void boilWater(){
        System.out.println("Кипятим воду");
    }

    abstract void brewCoffee();

    void pourInCup(){
        System.out.println("Наливаем в чашку");
    }

    abstract void addCondiments();
}
