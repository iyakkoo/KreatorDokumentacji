package pl.kuba.app.view;

import pl.kuba.app.view.buttons.ExecuteButton;
import pl.kuba.app.view.checkBoxes.*;
import pl.kuba.app.view.comboBoxes.ControlComboBox;
import pl.kuba.app.view.comboBoxes.SystemComboBox;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {

    public static String status = "";

    public MainPanel() throws HeadlessException {
        super("Kreator dokumentacji v1.0.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        setLayout(null);

        add(new OrderNamePanel());

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

        add(new AddOrderStructure());
        add(new AddProjectStructure());
        add(new AddCalculator());
        add(new ExecuteButton());
        add(new SystemComboBox());
        add(new AddSystemDocuments());
        add(new AddControlDocuments());
        add(new ControlComboBox());
        setVisible(true);

    }
}
