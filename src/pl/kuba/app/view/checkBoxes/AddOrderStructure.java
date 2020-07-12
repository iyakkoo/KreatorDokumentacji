package pl.kuba.app.view.checkBoxes;

import pl.kuba.app.logic.CreatorLogic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddOrderStructure extends JCheckBox implements ActionListener {

    public AddOrderStructure() {
        setBounds(20, 110 , 200, 30);
        setText("Struktura zlecenia");
        setVisible(true);
        setSelected(true);
        CreatorLogic.needOrderStructure = isSelected();
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isSelected()) {
            CreatorLogic.needOrderStructure = true;
        } else {
            CreatorLogic.needOrderStructure = false;
        }
    }
}
