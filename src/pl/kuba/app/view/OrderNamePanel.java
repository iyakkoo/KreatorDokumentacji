package pl.kuba.app.view;

import pl.kuba.app.logic.CreatorLogic;
import pl.kuba.app.view.textFields.OrderName;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        OrderName orderNameTextField = new OrderName();
        add(orderNameTextField);
        JButton nameAccept = new JButton("Zatwierdź");
        nameAccept.setBounds(450, 15, 100, 30);
        nameAccept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                if (s.equals("Zatwierdź")) {
                    // set the text of the label to the text of the field
                    String name = orderNameTextField.getText();
                    CreatorLogic.orderName = name;
                    agreedOrderName.setText("Zlecenie: " + name);

                    // set the text of field to blank
                    orderNameTextField.setText("");
                }
            }
        });
        add(nameAccept);
    }
}
