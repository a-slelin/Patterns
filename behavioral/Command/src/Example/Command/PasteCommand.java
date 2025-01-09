package Example.Command;

public class PasteCommand extends Command{
    @Override
    public boolean execute() {
        saveBackup();
        //editor.replaceSelection(app.clipboard)
        return true;
    }
}
