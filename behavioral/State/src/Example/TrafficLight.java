package Example;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new RedState(); // Начальное состояние - красный
    }

    public void setState(TrafficLightState state) {
        this.state = state;
        state.displayState();
    }

    public void changeState() {
        state.changeState(this);
    }
}

