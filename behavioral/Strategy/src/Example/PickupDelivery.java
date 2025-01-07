package Example;

public class PickupDelivery implements DeliveryStrategy{
    @Override
    public double calculateCost(double weight, String address) {
        return 0;
    }

    @Override
    public String calculateDeliveryTime(String address) {
        return "Сразу после оформления заказа";
    }
}
