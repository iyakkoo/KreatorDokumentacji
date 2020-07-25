package pl.kuba.app.view;

import pl.kuba.app.logic.ProjectInfo;
import pl.kuba.app.view.textFields.OrderNameTextField;

import javax.swing.*;

public class OrderNamePanel extends JPanel {

    public OrderNamePanel() {
        setBounds(0,0,600,70);
        setVisible(true);
        setLayout(null);

        JLabel pathLabel = new JLabel();
        pathLabel.setText("Nazwa projektu:");
        pathLabel.setBounds(20, 20, 120, 20);
        add(pathLabel);

        JLabel agreedOrderName = new JLabel();
        String textToShow = "";
        agreedOrderName.setBounds(20, 50, 300, 20);
        agreedOrderName.setText(textToShow);
        add(agreedOrderName);

        OrderNameTextField orderNameTextField = new OrderNameTextField();
        add(orderNameTextField);
        JButton nameAccept = new JButton("Zatwierdź");
        nameAccept.setBounds(450, 15, 100, 29);
        nameAccept.addActionListener(e -> {
            String s = e.getActionCommand();
            if (s.equals("Zatwierdź")) {
                String name = orderNameTextField.getText();
                ProjectInfo.orderName = name;
                agreedOrderName.setText("Zlecenie: " + name);
                orderNameTextField.setText("");
            }
        });
        add(nameAccept);
    }
}
