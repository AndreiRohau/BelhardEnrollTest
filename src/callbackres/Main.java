package callbackres;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        ActionListener listener = new TimePrinter();
        Timer t = new Timer(1000, listener);
        t.start();
        while (true) {
        }

    }
}
class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("Time is " + now);
    }
}
