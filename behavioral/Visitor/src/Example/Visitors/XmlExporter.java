package Example.Visitors;

import Example.ImageElement;
import Example.TableElement;
import Example.TextElement;

public class XmlExporter implements DocumentElementVisitor{
    @Override
    public void visit(TextElement element) {
        System.out.println("<text>" + element.getText() + "</text>");
    }
    @Override
    public void visit(ImageElement element) {
        System.out.println("<image src=\"" + element.getSrc() + "\" />");
    }
    @Override
    public void visit(TableElement element) {
        System.out.println("<table rows=\"" + element.getRows() + "\" cols=\"" + element.getCols() + "\"></table>");
    }
}
