package Example.UI_elem;

import Example.Command.Command;
import Example.Command.CommandHistory;

public class Application {
    public void executeCommand(Command command){
        if(command.execute()){
            CommandHistory.push(command);
        }
    }

    public void undo(){
        Command command = CommandHistory.pop();
        if(command != null){
            command.undo();
        }
    }
}
