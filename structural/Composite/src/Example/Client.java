package Example;

public class Client {
    public static void main(String[] args){
        // Создаем отдельные блюда
        Dish burger = new Dish("Burger", 10.99);
        Dish fries = new Dish("Fries", 3.99);
        Dish soda = new Dish("Soda", 2.49);

        // Создаем категории меню
        MenuCategory appetizers = new MenuCategory("Appetizers");
        appetizers.addItem(fries);
        appetizers.addItem(soda);

        MenuCategory mainCourses = new MenuCategory("Main Courses");
        mainCourses.addItem(burger);


        // Создаем главное меню
        MenuCategory menu = new MenuCategory("Menu");
        menu.addItem(appetizers);
        menu.addItem(mainCourses);

        // Выводим меню
        menu.print();
    }
}
