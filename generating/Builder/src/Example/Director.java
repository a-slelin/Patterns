package Example;

import Example.Builders.Builder;
import Example.Details.ModernTripComputer;
import Example.Details.MyGPS;
import Example.Details.SportEngine;

public class Director {
    public void constructSportCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setGPS(new MyGPS());
        builder.setTripComputer(new ModernTripComputer());
    }
}
