import javax.swing.JFrame;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {
    public HomePage() {
     
    //Window setup

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLocationRelativeTo(null);

    setSize(1200, 700);
    setLayout(new BorderLayout());
    System.out.println("HomePage created and should be vissble");
    
    setVisible(true);

    }
}

