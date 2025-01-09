package Structure;

import Structure.Building.*;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void make(String type){
        builder.reset();
        switch(type){
            case "first":
                builder.stepA();
                break;
            case "second":
                builder.stepB();
                builder.stepZ();
                break;
        }
    }
}
