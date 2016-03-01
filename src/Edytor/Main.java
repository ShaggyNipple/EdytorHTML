package Edytor;

import java.awt.EventQueue;

/**
 * Created by Dawid on 2016-02-09.
 */
public class Main {
    public static void main(String arg[]){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame();
            }
        });
    }
}
