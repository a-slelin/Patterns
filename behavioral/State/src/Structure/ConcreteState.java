package Structure;

public class ConcreteState implements State{
    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void doThis() {
        //business-logic
    }

    @Override
    public void doThat() {
        //business-logic
    }
}
