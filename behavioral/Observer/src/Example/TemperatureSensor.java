package Example;

import java.util.ArrayList;

public class TemperatureSensor {
    private double temp;
    private ArrayList<TemperatureObserver> subs;

    TemperatureSensor(){
        temp = 0;
        subs = new ArrayList<>();
    }

    public void addSub(TemperatureObserver sub){
        subs.add(sub);
    }

    public void removeSub(TemperatureObserver sub){
        subs.add(sub);
    }

    public void setTemp(double temp) {
        this.temp = temp;
        notifySubs();
    }

    public void notifySubs(){
        for(var sub : subs){
            sub.update(this.temp);
        }
    }
}
