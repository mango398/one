package de.bluhs.sw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: bluhs
 * Date: 02.02.2018
 * Time: 11:18
 */
public class AdderMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Fourth Swing Example");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        AdderGUI ag = new AdderGUI();
        JPanel panel = ag.getPanel();
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setVisible(true);
    }
}

