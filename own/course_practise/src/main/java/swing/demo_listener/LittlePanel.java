package swing.demo_listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
