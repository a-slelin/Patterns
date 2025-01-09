package Example;

import Example.Builders.Builder;
import Example.Builders.CarBuilder;
import Example.Builders.ManualCarBuilder;

public class Application {
    public static void main(String[] args){
        Director director = new Director();

        //Создадим спортивную машину
        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car sportCar = builder.getResult();

        //Создадим инструкцию к спортивной машине
        ManualCarBuilder builder2 = new ManualCarBuilder();
        director.constructSportCar(builder2);
        Manual manualSportCar = builder2.getResult();
    }
}
