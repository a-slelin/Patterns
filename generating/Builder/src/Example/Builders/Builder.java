package Example.Builders;

import Example.Details.Engine;
import Example.Details.GPS;
import Example.Details.TripComputer;

public interface Builder {
    void reset();
    void setSeats(int numbers);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);
    void setGPS(GPS gps);
}
