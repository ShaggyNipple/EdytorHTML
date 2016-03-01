package Edytor;

import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Dawid on 2016-02-09.
 */
public class ConvertListener implements ActionListener {
    private JTextArea textArea;
    private JEditorPane editorPane;

    public ConvertListener(HTMLPanel panel){
        textArea= panel.getTextArea();
        editorPane=panel.getEditorPane();
    }
    public void actionPerformed(ActionEvent event){
        //zmiany wyglądu wywołujemy w watki dystrybucji zdarzen
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String text= textArea.getText();
                editorPane.setText(text);
                editorPane.revalidate();
            }
        });
    }
}
