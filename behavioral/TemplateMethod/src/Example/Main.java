package Example;

public class Main {
    public static void main(String[] args) {
        CoffeeTemplate ct = new Espresso();
        ct.makeCoffee();

        ct = new Tea();
        ct.makeCoffee();
    }
}
