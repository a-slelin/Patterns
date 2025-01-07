package Example;

public class Client {
    public static void main(String[] args){
        Order order = new Order(100.89, "Red Square");

        // Выбор стратегии доставки
        order.setDeliveryStrategy(new CourierDelivery());
        System.out.println("Курьерская доставка: Стоимость = " +
                order.getDeliveryCost() + ", Время доставки = " + order.getDeliveryTime());

        order.setDeliveryStrategy(new PostalDelivery());
        System.out.println("Почтовая доставка: Стоимость = "
                + order.getDeliveryCost() + ", Время доставки = " + order.getDeliveryTime());

        order.setDeliveryStrategy(new PickupDelivery());
        System.out.println("Самовывоз: Стоимость = "
                + order.getDeliveryCost() + ", Время доставки = " + order.getDeliveryTime());
    }
}
