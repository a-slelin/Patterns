package Example;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor ts = new TemperatureSensor();
        Display display = new Display();
        Alert alert = new Alert();

        ts.addSub(display);
        ts.addSub(alert);

        ts.setTemp(25);
        ts.setTemp(35);
    }
}
