package Structure;

import Structure.System.*;

public class Client {
    public static void main(String[] args){
        Facade facade = new Facade(new SubsystemClass1(),
                new SubsystemClass2(),
                new AdditionalFacade1(new SubsystemClass3()),
                new AdditionalFacade2(new SubsystemClass4(), new SubsystemClass5()));

        facade.operation();
    }
}
