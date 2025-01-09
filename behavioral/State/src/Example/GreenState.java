package Example;

public class GreenState implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    @Override
    public void displayState() {
        System.out.println("Зеленый свет");
    }
}
