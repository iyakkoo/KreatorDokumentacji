package pl.kuba.app.view.textFields;

import pl.kuba.app.logic.CreatorLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderName extends JTextField implements ActionListener {


    public OrderName() {
        setBounds(130, 15, 320, 30);
        setToolTipText("np. 1234_RE_Klient_Inwestycja_SH");
        setVisible(true);
        setBackground(Color.WHITE);
        addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CreatorLogic.orderName = getText();
    }
}
