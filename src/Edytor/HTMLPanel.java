package Edytor;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Dawid on 2016-02-09.
 */
public class HTMLPanel extends JPanel {
    private final JTextArea textArea = new JTextArea();
    private final JEditorPane editorPane = new JEditorPane();

    public HTMLPanel(){
        super();
        setLayout(new BorderLayout());
        createPanels();
    }
    private void createPanels(){
        editorPane.setEditable(false);//bez edytowania tego cos sie wyswietli

        editorPane.setContentType("text/html");//rozpoznawanie znacznikow html
        JButton actionButton = new JButton("Podgląd");//przycisk generowania podglądu
        actionButton.addActionListener(new ConvertListener(this));
        //panel pmocniczy
        JPanel helpPanel=new JPanel();
        helpPanel.setLayout(new GridLayout(1,2));
        textArea.setBackground(Color.lightGray);
        //dodajemy komponenty tekstowe do pomocniczego panelu
        helpPanel.add(textArea);
        helpPanel.add(editorPane);
        //dodanie wszystkiego do glownego panelu
        this.add(helpPanel, BorderLayout.CENTER);
        this.add(actionButton, BorderLayout.SOUTH);
    }

    public JTextArea getTextArea(){
        return textArea;
    }

    public  JEditorPane getEditorPane(){
        return editorPane;
    }
}
