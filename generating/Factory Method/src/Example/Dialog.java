package Example;

import Example.Products.Button;

abstract public class Dialog {
    public abstract Button createButton();
    public void renderWindow() {
        // Отрисовать остальные элементы интерфейса.
        Button okButton = createButton();
        okButton.onClick(/*closeDialog*/);
        okButton.render();
    }
}
