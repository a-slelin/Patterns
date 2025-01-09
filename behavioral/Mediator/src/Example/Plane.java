package Example;

public class Plane implements AirTransport{
    private Dispatcher dispatcher;

    public Plane(Dispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    @Override
    public void fly(){
        System.out.println("Plane is flying!");
        dispatcher.notify(this, "fly");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing!");
        dispatcher.notify(this, "land");
    }
}
