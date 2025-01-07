package Example;

public interface DeliveryStrategy {
    double calculateCost(double weight, String address);
    String calculateDeliveryTime(String address);
}