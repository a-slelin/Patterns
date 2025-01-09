package Example;

import javax.swing.*;

class ButtonHelpHandler implements HelpHandler {
    private HelpHandler nextHandler;

    @Override
    public void handleHelp(String topic) {
        if (topic.equals("button")) {
            JOptionPane.showMessageDialog(null, "Нажмите кнопку, чтобы выполнить действие.");
        } else if (nextHandler != null) {
            nextHandler.handleHelp(topic);
        } else {
            JOptionPane.showMessageDialog(null, "Справка по этой теме не найдена.");
        }
    }

    @Override
    public void setNextHandler(HelpHandler next) {
        this.nextHandler = next;
    }
}