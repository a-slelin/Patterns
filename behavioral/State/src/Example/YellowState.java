package Example;

public class YellowState implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    @Override
    public void displayState() {
        System.out.println("Желтый свет");
    }
}
