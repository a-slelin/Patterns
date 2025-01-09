package Example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight trafficLight = new TrafficLight();

        while(true){
            Thread.sleep(1000);
            trafficLight.changeState();
            Thread.sleep(500);
            trafficLight.changeState();
            Thread.sleep(2000);
            trafficLight.changeState();
        }
    }
}
