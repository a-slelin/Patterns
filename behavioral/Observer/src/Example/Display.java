package Example;

public class Display implements TemperatureObserver{
    @Override
    public void update(double temp) {
        System.out.println("Температура: " + temp + "°C");
    }
}
