package pl.kuba.app.view.comboBoxes;

import pl.kuba.app.logic.CreatorLogic;
import pl.kuba.app.logic.ProjectInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlComboBox extends JComboBox implements ActionListener {

    public ControlComboBox() {
        super(new ProjectInfo().getControls());
        setBounds(300, 190, 150, 30);
        setSelectedIndex(0);
        setBackground(Color.WHITE);
        CreatorLogic.controlDocType = 0;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String systemType = (String)cb.getSelectedItem();
        String[] controls = new ProjectInfo().getControls();
        for (int i = 0; i < controls.length; i++) {
            if (controls[i].equals(systemType)) {
                CreatorLogic.sysDocType = i;
                System.out.println(i);
            }
        }
    }
}
