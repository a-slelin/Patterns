package Example.Builders;

import Example.Car;
import Example.Details.Engine;
import Example.Details.GPS;
import Example.Details.TripComputer;

public class CarBuilder implements Builder {
    private Car car;
    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int numbers) {
        // Установить указанное количество сидений.
    }

    @Override
    public void setEngine(Engine engine) {
        // Установить поданный двигатель.
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        // Установить поданную систему навигации.
    }

    @Override
    public void setGPS(GPS gps) {
        // Установить или снять GPS.
    }

    public Car getResult(){
        return car;
    }
}
