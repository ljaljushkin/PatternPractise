package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface LordListener {

    public void displayMessage(String text);
}

public class Main {

    public static void main(String[] args) {

        new MightyFrame().setVisible(true);
    }
}

class MightyFrame extends JFrame {

    private static final int FIELD_COUNT = 10;
    LittlePanel littleSoldier = new LittlePanel();
    JTextField[] fields = new JTextField[FIELD_COUNT];

    public MightyFrame() {

        JPanel fieldPanel = new JPanel(new GridLayout(0, 1, 0, 5));
        for (int i = 0; i < fields.length; i++) {
            fields[i] = new JTextField(10);
            fieldPanel.add(fields[i]);
        }

        this.getContentPane().add(BorderLayout.CENTER, littleSoldier);
        getContentPane().add(fieldPanel, BorderLayout.PAGE_END);

        //this.setSize(150, 100);
        pack();
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        littleSoldier.addLordListener(new LordListener() {

            public void displayMessage(String text) {
                //JOptionPane.showMessageDialog(MightyFrame.this, text);
                for (JTextField field : fields) {
                    field.setText(text);
                }
            }
        });

    }

}

class LittlePanel extends JPanel {

    JButton btnOne = new JButton("Yes");
    JButton btnTwo = new JButton("No");
    private LordListener listener;

    public LittlePanel() {

        this.add(btnOne);
        this.add(btnTwo);

        // Adding ActionListener to 'btnOne'
        btnOne.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                littleTestOne();
            }
        });

        // Adding ActionListener to 'btnTwo'
        btnTwo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                littleTestTwo();
            }
        });
    }

    public void addLordListener(LordListener listening) {

        this.listener = listening;
    }

    private void littleTestOne() {
        this.listener.displayMessage("U CLICKED YES");
    }

    private void littleTestTwo() {
        this.listener.displayMessage("U CLICKED NO");
    }

}

