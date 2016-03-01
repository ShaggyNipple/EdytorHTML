package Edytor;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dawid on 2016-02-09.
 */
public class LoginPanel extends JPanel {
    private JTextField nameField;//pole na nazwe
    private JPasswordField passField; //pole na haslo
    private JButton loginButton; // przycisk logowania
    private LoginListener listener; //słuchacz przycisku

    public LoginPanel(LoginListener listener){
        super();
        //ustawienie layoutu
        GridBagLayout gridBag= new GridBagLayout();
        GridBagConstraints constraints= new GridBagConstraints();//ograniczenia layoutu
        constraints.fill=GridBagConstraints.CENTER;
        gridBag.setConstraints(this,constraints);//dołaczenie ograniczen
        setLayout(gridBag);//dolaczenie layoutu
        this.listener = listener;
        this.listener.setPanel(this);
        createComponents();
    }

    // @return Nazwa uzytkownika
    public String getName(){
        return nameField.getText();
    }
    // @return Haslo uzytkownika
    public String getPassword(){
        String password="";
        char[] pass=passField.getPassword();
        for(int i=0; i<pass.length; i++)
            password += pass[i];
        return password;
    }

    //Metoda która tworzt etykiety i pola do wprowadzania danych
    private void createComponents(){
        JLabel name= new JLabel("Name: ");
        JLabel password =  new JLabel("Password: ");
        nameField = new JTextField();
        passField = new JPasswordField();

        //pomocniczy panel do wprowadzania danych
        JPanel inputPanel =  new JPanel();
        inputPanel.setLayout(new GridLayout(2,2));
        inputPanel.add(name);
        inputPanel.add(nameField);
        inputPanel.add(password);
        inputPanel.add(passField);
        //przycisk logowania
        loginButton= new JButton("Zaloguj");
        loginButton.addActionListener(listener);

        //pomocniczy panel do wysrodkowania
        JPanel parentPanel = new JPanel();
        parentPanel.setLayout(new BorderLayout());
        parentPanel.add(inputPanel,BorderLayout.CENTER);
        parentPanel.add(loginButton,BorderLayout.SOUTH);

        this.add(parentPanel);

    }
}
