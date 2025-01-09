package Structure1;

public class Originator {
    class Memento{
        private String fix_state;

        private Memento(String fix_state){
            this.fix_state = String.copyValueOf(fix_state.toCharArray());
        }

        private String getState(){
            return fix_state;
        }
    }

    private String state;

    public Originator(String state){
        this.state = String.copyValueOf(state.toCharArray());
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento save(){
        return new Memento(state);
    }

    public void restore(Memento m){
        this.state = String.copyValueOf(m.getState().toCharArray());
    }

    public void print(){
        System.out.println(state);
    }
}
