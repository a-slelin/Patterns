package Example.UI_elem;

public class Text {
    private String text;

    public Text(){
        text = "";
    }

    public Text(String text){
        this.text = text;
    }

    public String get(){
        return text;
    }

    public void set(String text){
        this.text = text;
    }
}
