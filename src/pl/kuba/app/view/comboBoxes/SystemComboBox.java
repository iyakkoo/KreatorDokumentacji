package pl.kuba.app.view.comboBoxes;

import pl.kuba.app.logic.CreatorLogic;
import pl.kuba.app.logic.ProjectInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemComboBox extends JComboBox implements ActionListener {


    public SystemComboBox() {
        super(new ProjectInfo().getSystems());
        setBounds(300, 120, 150, 30);
        setSelectedIndex(0);
        setBackground(Color.WHITE);
        CreatorLogic.sysDocType = 0;
        addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String systemType = (String)cb.getSelectedItem();
        String[] systems = new ProjectInfo().getSystems();
        for (int i = 0; i < systems.length; i++) {
            if (systems[i].equals(systemType)) {
                CreatorLogic.sysDocType = i;
                System.out.println(i);
            }
        }

    }



}
