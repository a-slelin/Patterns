package Example.Visitors;

public interface Visitable {
    void accept(DocumentElementVisitor visitor);
}
