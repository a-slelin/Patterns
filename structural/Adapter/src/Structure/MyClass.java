package Structure;

public class MyClass {
    private int field;

    MyClass(int field){
        this.field = field;
    }

    @Override
    public String toString(){
        return "This is MyClass with field " + field;
    }
}
