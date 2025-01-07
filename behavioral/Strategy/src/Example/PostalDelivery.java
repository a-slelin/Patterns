package Example;

public class PostalDelivery implements DeliveryStrategy{
    @Override
    public double calculateCost(double weight, String address) {
        return 5 + weight * 1;
    }

    @Override
    public String calculateDeliveryTime(String address) {
        return "3-5 дней";
    }
}
