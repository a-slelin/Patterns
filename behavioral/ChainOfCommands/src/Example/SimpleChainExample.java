package Example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleChainExample {

    public static void main(String[] args) {
        HelpHandler buttonHelp = new ButtonHelpHandler();
        HelpHandler menuHelp = new MenuHelpHandler();

        // Создаем цепочку: buttonHelp -> menuHelp
        buttonHelp.setNextHandler(menuHelp);


        JButton button = new JButton("Помощь по кнопкам");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonHelp.handleHelp("button");
            }
        });

        JButton menuButton = new JButton("Помощь по меню");
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonHelp.handleHelp("menu");
            }
        });


        JButton unknownButton = new JButton("Помощь по неизвестному");
        unknownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonHelp.handleHelp("unknown");
            }
        });


        JFrame frame = new JFrame("Chain of Responsibility Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(menuButton);
        panel.add(unknownButton);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
