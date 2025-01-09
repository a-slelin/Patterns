package Example.Visitors;

import Example.ImageElement;
import Example.TableElement;
import Example.TextElement;

public class SizeCalculator implements DocumentElementVisitor{
    @Override
    public void visit(TextElement element) {
        System.out.println("Text size: " + element.getText().length());
    }
    @Override
    public void visit(ImageElement element) {
        System.out.println("Image size: " + element.getSize());
    }
    @Override
    public void visit(TableElement element) {
        System.out.println("Table size: " + element.getRows() * element.getCols());
    }
}
