package Structure;

public class Context {
    private State state;

    public Context(State state){
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doThis(){
        state.doThis();
    }

    public void doThat(){
        state.doThat();
    }
}
