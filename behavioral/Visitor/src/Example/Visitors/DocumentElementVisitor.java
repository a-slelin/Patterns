package Example.Visitors;

import Example.ImageElement;
import Example.TableElement;
import Example.TextElement;

public interface DocumentElementVisitor {
    void visit(TableElement element);
    void visit(ImageElement element);
    void visit(TextElement element);
}
