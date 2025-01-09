package Example;

import Example.Visitors.DocumentElementVisitor;
import Example.Visitors.Visitable;

public class TableElement implements Visitable {
    private int rows;
    private int cols;

    TableElement(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    @Override
    public void accept(DocumentElementVisitor visitor) {
        visitor.visit(this);
    }
}
