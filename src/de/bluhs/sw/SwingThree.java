package de.bluhs.sw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: bluhs
 * Date: 01.02.2018
 * Time: 10:44
 */

public class SwingThree {
    private static JTextField textFirst;
    private static JTextField textSecond;
    private static JTextField textResult;
    private static JLabel labelMsg;

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Third Swing Example..");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel myPanel) {
        JButton buttonCalculate;
        JButton buttonClear;
        JLabel plusLabel;
        JPanel panel1; //input
        JPanel panel2; //output
        JPanel panel3; //clear
        FlowLayout flowLayout;

        myPanel.setLayout(new BorderLayout());

        buttonCalculate = new JButton("=");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        buttonClear = new JButton("clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        textFirst = new JTextField();
        textFirst.setPreferredSize(new Dimension( 50, 26));
        textSecond = new JTextField();
        textSecond.setPreferredSize(new Dimension( 50, 26));
        textResult = new JTextField();
        textResult.setEditable(false);
        textResult.setPreferredSize(new Dimension( 50, 26));
        labelMsg = new JLabel();
        labelMsg.setPreferredSize(new Dimension( 300, 50));

        plusLabel = new JLabel ("+");
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel1.add(textFirst);
        panel1.add(plusLabel);
        panel1.add(textSecond);
        panel1.add(buttonCalculate);
        panel1.add(textResult);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel2.add(buttonClear);

        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel3.add(labelMsg);

        myPanel.add(panel1,BorderLayout.PAGE_START);
        myPanel.add(panel2,BorderLayout.CENTER);
        myPanel.add(panel3,BorderLayout.PAGE_END);

    }
    private static void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            labelMsg.setText("");
            int first = (int)(Double.parseDouble(textFirst.getText()));
            int second = (int)(Double.parseDouble(textSecond.getText()));
            int result = first+second;
            textResult.setText(""+result);
        }catch (NumberFormatException nfe){
            labelMsg.setText("<html>" + nfe.toString() + "</html>");
        }

    }
    private static void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        textFirst.setText("");
        textSecond.setText("");
        textResult.setText("");
        labelMsg.setText("");
    }
}
