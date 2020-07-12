package pl.kuba.app.view;

import pl.kuba.app.view.buttons.ExecuteButton;
import pl.kuba.app.view.checkBoxes.AddCalculator;
import pl.kuba.app.view.checkBoxes.AddOrderStructure;
import pl.kuba.app.view.checkBoxes.AddProjectStructure;
import pl.kuba.app.view.textFields.OrderName;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {

    public MainPanel() throws HeadlessException {
        super("Kreator dokumentacji v1.0.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setVisible(true);
        setLayout(null);

        add(new OrderNamePanel());

        JLabel actionInfo = new JLabel();
        actionInfo.setBounds(20, 90, 200, 20);
        actionInfo.setText("Wskaż czynności do wykonania:");
        add(actionInfo);

        add(new AddOrderStructure());
        add(new AddProjectStructure());
        add(new AddCalculator());
        add(new ExecuteButton());
    }
}
