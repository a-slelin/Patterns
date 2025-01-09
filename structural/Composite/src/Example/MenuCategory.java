package Example;

import java.util.ArrayList;

public class MenuCategory implements MenuItem{
    private String name;
    private ArrayList<MenuItem> items = new ArrayList<>();

    MenuCategory(String name){
        this.name = name;
    }

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void removeItem(MenuItem item){
        items.remove(item);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    @Override
    public void print() {
        System.out.println(name + " : ");
        for(MenuItem item : items){
            item.print();
        }
        System.out.println("Total: $" + this.getPrice());
    }
}
