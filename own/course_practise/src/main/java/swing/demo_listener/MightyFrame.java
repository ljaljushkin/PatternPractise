package swing.demo_listener;

import javax.swing.*;
import java.awt.*;

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

        littleSoldier.addLordListener(new ILordListener() {

            @Override
            public void displayMessage(String text) {
                //JOptionPane.showMessageDialog(MightyFrame.this, text);
                for (JTextField field : fields) {
                    field.setText(text);
                }
            }
        });

    }

}
