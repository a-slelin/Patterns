package Example;

public class Order {
    private DeliveryStrategy strategy;
    private String address;
    private double weight;

    Order(double weight, String address){
        this.weight = weight;
        this.address = address;
    }


    public void setDeliveryStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public double getDeliveryCost() {
        if (strategy == null) {
            throw new IllegalStateException("Delivery strategy not set");
        }
        return strategy.calculateCost(weight, address);
    }

    public String getDeliveryTime() {
        if (strategy == null) {
            throw new IllegalStateException("Delivery strategy not set");
        }
        return strategy.calculateDeliveryTime(address);
    }
}
