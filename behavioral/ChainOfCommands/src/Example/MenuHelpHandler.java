package Example;

import javax.swing.*;

class MenuHelpHandler implements HelpHandler {
    private HelpHandler nextHandler;

    @Override
    public void handleHelp(String topic) {
        if (topic.equals("menu")) {
            JOptionPane.showMessageDialog(null, "Выберите пункт меню, чтобы выполнить действие.");
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