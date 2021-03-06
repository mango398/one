package de.bluhs.sw;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: bluhs
 * Date: 02.02.2018
 * Time: 11:17
 */
class AdderGUI {

    private final JTextField textFirst;
    private final JTextField textSecond;
    private final JTextField textResult;
    private final JLabel labelMsg;

    private final JPanel myPanel;


    public AdderGUI() {
        myPanel = new JPanel();
        myPanel.setLayout(new BorderLayout());

        JButton buttonCalculate = new JButton("=");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        JButton buttonClear = new JButton("clear");
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

        JLabel plusLabel = new JLabel("+");
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel1.add(textFirst);
        panel1.add(plusLabel);
        panel1.add(textSecond);
        panel1.add(buttonCalculate);
        panel1.add(textResult);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel2.add(buttonClear);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel3.add(labelMsg);

        myPanel.add(panel1,BorderLayout.PAGE_START);
        myPanel.add(panel2,BorderLayout.CENTER);
        myPanel.add(panel3,BorderLayout.PAGE_END);
    }

    public JPanel getPanel(){
        return myPanel;
    }
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            labelMsg.setText("");
            int first = (int)(Double.parseDouble(textFirst.getText()));
            int second = (int)(Double.parseDouble(textSecond.getText()));
            int result = Adder.addIntegers(first, second);
            textResult.setText(""+result);
        }catch (NumberFormatException nfe){
            labelMsg.setText("<html>" + nfe.toString() + "</html>");
        }

    }
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        textFirst.setText("");
        textSecond.setText("");
        textResult.setText("");
        labelMsg.setText("");
    }
}
