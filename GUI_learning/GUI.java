package GUI_learning;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    public GUI() {
        frame = new JFrame();
        JButton button = new JButton("Click me!");
        button.addActionListener(this);
        panel = new JPanel();
        label = new JLabel("Number of clicks: 0");
        Color red = new Color(255, 0, 0);
        Color transparent_red = new Color(255, 0, 0, 0);
        label.setOpaque(true);
        label.setBackground(transparent_red);
        label.setForeground(red);

        panel.setBorder(BorderFactory.createEmptyBorder(100, 200, 200, 500));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks " + count);
    }

}
