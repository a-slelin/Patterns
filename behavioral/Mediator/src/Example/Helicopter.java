package Example;

public class Helicopter implements AirTransport{
    private Dispatcher dispatcher;

    public Helicopter(Dispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    @Override
    public void fly(){
        System.out.println("Helicopter is flying!");
        dispatcher.notify(this, "fly");
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing!");
        dispatcher.notify(this, "land");
    }
}
