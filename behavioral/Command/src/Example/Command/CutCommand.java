package Example.Command;

public class CutCommand extends Command{
    @Override
    public boolean execute() {
        saveBackup();
        //app.clipboard = editor.getSelection()
        //editor.deleteSelection()
        return true;
    }
}
