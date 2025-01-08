package Example;

import Example.Products.Button;
import Example.Products.HTMLButton;

public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
