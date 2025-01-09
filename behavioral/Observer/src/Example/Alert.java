package Example;

public class Alert implements TemperatureObserver{
    @Override
    public void update(double temp) {
        if (temp > 30) {
            System.out.println("Внимание! Высокая температура!");
        }
    }
}
