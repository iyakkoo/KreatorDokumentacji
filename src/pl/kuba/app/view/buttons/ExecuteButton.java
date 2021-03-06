package pl.kuba.app.view.buttons;

import pl.kuba.app.logic.ExecuteThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExecuteButton extends JButton implements ActionListener {

    public ExecuteButton() {
        setBounds(250, 300, 100, 30);
        setText("Wykonaj");
        setVisible(true);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ExecuteThread executeThread = new ExecuteThread();
        executeThread.run();
    }
}
