package Example;

import Example.Visitors.DocumentElementVisitor;
import Example.Visitors.Visitable;

public class TextElement implements Visitable {
    private String text;

    TextElement(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(DocumentElementVisitor visitor) {
        visitor.visit(this);
    }
}
