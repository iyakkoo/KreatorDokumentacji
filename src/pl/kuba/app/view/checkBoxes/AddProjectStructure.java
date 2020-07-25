package pl.kuba.app.view.checkBoxes;

import pl.kuba.app.logic.CreatorLogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProjectStructure extends JCheckBox implements ActionListener {

    public AddProjectStructure() {
        setBounds(20, 140 , 200, 30);
        setText("Struktura projektu");
        setVisible(true);
        setSelected(true);
        CreatorLogic.needProjectStructure = isSelected();
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CreatorLogic.needProjectStructure = isSelected();
    }
}
