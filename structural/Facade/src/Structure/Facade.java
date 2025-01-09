package Structure;

import Structure.System.*;

public class Facade {
    private SubsystemClass1 link1;
    private SubsystemClass2 link2;
    //...

    private AdditionalFacade1 link30;
    private AdditionalFacade2 link31;
    //...

    public Facade(SubsystemClass1 subsystemClass1,
                  SubsystemClass2 subsystemClass2,
                  //...
                  AdditionalFacade1 additionalFacade1,
                  AdditionalFacade2 additionalFacade2
                  //...
                  ){
        this.link1 = subsystemClass1;
        this.link2 = subsystemClass2;
        //...
        this.link30 = additionalFacade1;
        this.link31 = additionalFacade2;
        //...
    }

    public void operation(){
        //...
    }
}
