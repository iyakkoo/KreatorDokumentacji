package pl.kuba.app.view.checkBoxes;

import pl.kuba.app.logic.CreatorLogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCalculator extends JCheckBox implements ActionListener {

    public AddCalculator() {
        setBounds(20, 170 , 250, 30);
        setText("Dodaj Procedurę Wyceny do Obliczeń");
        setVisible(true);
        setSelected(true);
        CreatorLogic.needDefaultCalculator = isSelected();
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CreatorLogic.needDefaultCalculator = isSelected();
    }
}
