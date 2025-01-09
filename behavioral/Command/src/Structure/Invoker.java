package Structure;

public class Invoker {
    private Command command;

    public Invoker(){
        command = null;
    }

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void exeCommand(){
        command.execute();
        //more something
    }
}
