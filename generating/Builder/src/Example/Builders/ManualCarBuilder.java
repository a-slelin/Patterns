package Example.Builders;

import Example.Details.Engine;
import Example.Details.GPS;
import Example.Details.TripComputer;
import Example.Manual;

public class ManualCarBuilder implements Builder{
    private Manual manual;
    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int numbers) {
        // Описать сколько мест в машине.
    }

    @Override
    public void setEngine(Engine engine) {
        // Добавить в руководство описание двигателя.
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        // Добавить в руководство описание системы навигации.
    }

    @Override
    public void setGPS(GPS gps) {
        // Добавить в инструкцию инструкцию GPS.
    }

    public Manual getResult(){
        return manual;
    }
}
