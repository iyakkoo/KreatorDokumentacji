package pl.kuba.app.view.checkBoxes;

import pl.kuba.app.logic.CreatorLogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSystemDocuments extends JCheckBox implements ActionListener {

    public AddSystemDocuments() {
        setText("Dodaj dokumentację SUG");
        setBounds(20, 200, 250, 30);
        setSelected(true);
        CreatorLogic.needSystemDocumentation = isSelected();
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CreatorLogic.needSystemDocumentation = isSelected();
    }
}
