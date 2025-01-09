package Structure;

import Structure.System.SubsystemClass4;
import Structure.System.SubsystemClass5;

public class AdditionalFacade2 {
    private SubsystemClass4 link1;
    private SubsystemClass5 link2;

    AdditionalFacade2(SubsystemClass4 link1, SubsystemClass5 link2){
        this.link1 = link1;
        this.link2 = link2;
    }

    public void operation2(){
        //...
    }
}
