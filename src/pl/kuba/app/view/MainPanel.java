package pl.kuba.app.view;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame {

    public MainPanel() throws HeadlessException {
        super("Kreator dokumentacji v1.0.0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setVisible(true);
        setLayout(null);

        JLabel pathLabel = new JLabel();
        pathLabel.setText("Wskaż lokalizację nowego projektu:");
        pathLabel.setBounds(10, 10, 250, 15);
        //add(pathLabel);

        JFileChooser pathChooser = new JFileChooser();
        pathChooser.setCurrentDirectory(new java.io.File("."));
        pathChooser.setDialogTitle("Wskaż lokalizację nowego projektu");
        pathChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        pathChooser.setAcceptAllFileFilterUsed(false);
        //pathChooser.setDialogTitle("Wskaż lokalizację nowego projektu");
        add(pathChooser);

    }
}
