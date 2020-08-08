package pl.kuba.app.view;

import pl.kuba.app.view.buttons.ExecuteButton;
import pl.kuba.app.view.checkBoxes.*;
import pl.kuba.app.view.comboBoxes.ControlComboBox;
import pl.kuba.app.view.comboBoxes.SystemComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JFrame {

    public static String status = "";

    public MainPanel() throws HeadlessException {
        super("Kreator dokumentacji v1.0.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);
        setLayout(null);
        OrderNamePanel orderNamePanel = new OrderNamePanel();
        add(orderNamePanel);

        JLabel actionInfo = new JLabel();
        actionInfo.setBounds(20, 90, 200, 20);
        actionInfo.setText("Wskaż czynności do wykonania:");
        add(actionInfo);

        JLabel messageSystem = new JLabel();
        messageSystem.setText("Wskaż rodzaj systemu");
        messageSystem.setBounds(300, 90, 200, 20);
        add(messageSystem);

        JLabel messageCentral = new JLabel();
        messageCentral.setText("Wskaż rodzaj centrali");
        messageCentral.setBounds(300, 160, 200, 20);
        add(messageCentral);

        AddOrderStructure orderStructure = new AddOrderStructure();
        AddProjectStructure addProjectStructure = new AddProjectStructure();
        AddCalculator addCalculator = new AddCalculator();
        ExecuteButton executeButton = new ExecuteButton();
        SystemComboBox systemComboBox = new SystemComboBox();
        AddSystemDocuments addSystemDocuments = new AddSystemDocuments();
        AddControlDocuments addControlDocuments = new AddControlDocuments();
        ControlComboBox controlComboBox = new ControlComboBox();

        ActionListener al = (ActionEvent e) -> {
            if (!orderStructure.isSelected()) {
                addProjectStructure.setSelected(false);
                addCalculator.setSelected(false);
                addSystemDocuments.setSelected(false);
                addControlDocuments.setSelected(false);
            }
        };

        ActionListener al2 = (ActionEvent e) -> {
            if (!addProjectStructure.isSelected()) {
                addCalculator.setSelected(false);
                addSystemDocuments.setSelected(false);
                addControlDocuments.setSelected(false);
            }
        };
        orderStructure.addActionListener(al);
        addProjectStructure.addActionListener(al2);
        add(orderStructure);
        add(addProjectStructure);
        add(addCalculator);
        add(executeButton);
        add(systemComboBox);
        add(addSystemDocuments);
        add(addControlDocuments);
        add(controlComboBox);
        setVisible(true);

    }
}
