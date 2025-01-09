package Example;

public class Event {
    public static void main(String[] args) {
        Dispatcher dispatcher1 = new Dispatcher();
        Dispatcher dispatcher2 = new Dispatcher();

        Aircraft aircraft = new Aircraft(dispatcher1);
        Plane plane = new Plane(dispatcher1);
        Helicopter helicopter = new Helicopter(dispatcher1);

        aircraft.fly();
        plane.fly();
        helicopter.fly();

        plane.land();
        helicopter.land();

        aircraft.setDispatcher(dispatcher2);
        aircraft.land();
    }
}
