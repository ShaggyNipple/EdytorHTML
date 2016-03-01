package Edytor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dawid on 2016-02-09.
 */
public class LoginListener implements ActionListener{
    //glowna ramka programu
    private final JFrame frame;

    private LoginPanel loginPanel;

    public void setPanel(LoginPanel loginPanel){
        this.loginPanel=loginPanel;
    }

    public LoginListener(JFrame frame){
        this.frame=frame;
    }
    public void actionPerformed(ActionEvent event){
        String name = loginPanel.getName();
        String password = loginPanel.getPassword();
        if(UserValidator.authenticate(name, password)){
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    //panel z edytorem html
                    JPanel htmlPanel= new HTMLPanel();
                    //usuwamy panel logowania
                    frame.getContentPane().removeAll();
                    //dodajemy panel html
                    frame.add(htmlPanel);
                    frame.validate();
                }
            });
        }
    }
}
