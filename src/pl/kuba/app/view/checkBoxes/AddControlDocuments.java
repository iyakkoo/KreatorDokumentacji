package pl.kuba.app.view.checkBoxes;

import pl.kuba.app.logic.CreatorLogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddControlDocuments extends JCheckBox implements ActionListener {

    public AddControlDocuments() {
        setText("Dodaj dokumentację SSP");
        setBounds(20, 230, 250, 30);
        setSelected(true);
        CreatorLogic.needControlDocumentation = isSelected();
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CreatorLogic.needControlDocumentation = isSelected();
    }
}
