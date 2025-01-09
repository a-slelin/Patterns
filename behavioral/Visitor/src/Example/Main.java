package Example;

import Example.Visitors.DocumentElementVisitor;
import Example.Visitors.SizeCalculator;
import Example.Visitors.Visitable;
import Example.Visitors.XmlExporter;

public class Main {
    public static void main(String[] args) {
        Visitable[] elements = {
                new TextElement("Hello"),
                new ImageElement("image.jpg", 1024),
                new TableElement(2, 3)
        };

        DocumentElementVisitor calculator = new SizeCalculator();
        DocumentElementVisitor exporter = new XmlExporter();

        System.out.println("Calculating sizes:");
        for (Visitable element : elements) {
            element.accept(calculator);
        }

        System.out.println("\nExporting to XML:");
        for (Visitable element : elements) {
            element.accept(exporter);
        }
    }
}
