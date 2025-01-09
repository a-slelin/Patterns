package Example.Command;

import Example.UI_elem.Application;
import Example.UI_elem.Editor;
import Example.UI_elem.Text;

abstract public class Command {
    private Application app;
    private Editor editor;
    private Text backup;

    public Command(){}

    public Command(Application app, Editor editor){
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup(){
        if(editor == null){
            return;
        }
        backup = editor.getText();
    }

    public void undo(){
        if(backup == null){
            return;
        }
        editor.setText(backup);
    }

    abstract public boolean execute();
}
