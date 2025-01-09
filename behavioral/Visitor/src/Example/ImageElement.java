package Example;

import Example.Visitors.DocumentElementVisitor;
import Example.Visitors.Visitable;
import Structure.Visitor;

public class ImageElement implements Visitable{
    private String src;
    private int size;

    ImageElement(String src, int size){
        this.src = src;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getSrc() {
        return src;
    }

    @Override
    public void accept(DocumentElementVisitor visitor) {
        visitor.visit(this);
    }
}
