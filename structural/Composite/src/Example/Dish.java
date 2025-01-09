package Example;

import java.awt.*;

public class Dish implements MenuItem{
    private String name;
    private double price;

    Dish(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("  - " + name + ": $" + price);
    }
}
