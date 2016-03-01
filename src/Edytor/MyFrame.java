package Edytor;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
/**
 * Created by Dawid on 2016-02-09.
 */
public class MyFrame extends JFrame {
    public MyFrame(){
        super("Edytor");
        LoginListener listener= new LoginListener(this);
        JPanel loginPanel= new LoginPanel(listener);
        add(loginPanel);

        setPreferredSize(new Dimension(600,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
