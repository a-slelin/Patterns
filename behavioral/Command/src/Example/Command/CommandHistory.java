package Example.Command;

import java.util.Stack;

public class CommandHistory {
    private static Stack<Command> history = new Stack<>();
    public static void push(Command cmd){
        history.push(cmd);
    }
    public static Command pop(){
        return history.pop();
    }
}

