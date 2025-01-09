package Example;

class RedState implements TrafficLightState {
    @Override
    public void changeState(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    @Override
    public void displayState() {
        System.out.println("Красный свет");
    }
}
