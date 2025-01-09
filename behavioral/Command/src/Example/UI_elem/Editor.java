package Example.UI_elem;

public class Editor {
    private Text text;

    public Editor(Text text){
        this.text = text;
    }

    public Text getText(){
        return text;
    }

    public void setText(Text text){
        this.text = text;
    }
}
