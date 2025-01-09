package Example;

public class Aircraft implements AirTransport{
    private Dispatcher dispatcher;

    public Aircraft(Dispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    @Override
    public void fly(){
        System.out.println("Aircraft is flying!");
        dispatcher.notify(this, "fly");
    }

    @Override
    public void land() {
        System.out.println("Aircraft is landing!");
        dispatcher.notify(this, "land");
    }
}
