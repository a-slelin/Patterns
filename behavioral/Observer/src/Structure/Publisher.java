package Structure;

import java.util.ArrayList;

public class Publisher {
    private ArrayList<Subscriber> subscribers;
    private Object mainState;

    Publisher(){
        subscribers = new ArrayList<>();
        mainState = new Object();
    }

    public void add(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void remove(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(){
        for(Subscriber sub : subscribers){
            sub.update();
        }
    }

    public void mainBusinessLogic(){
        //...
        mainState = new Object();
        notifySubscribers();
        //...
    }
}
