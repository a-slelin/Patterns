package Example;

public class CourierDelivery implements DeliveryStrategy{
    @Override
    public double calculateCost(double weight, String address) {
        return 10 + weight * 2;
    }

    @Override
    public String calculateDeliveryTime(String address) {
        return "1-2 дня";
    }
}
