package Java_OOP.tutorials.Exam_Revision;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdditionTest extends JFrame {

    private JTextField inputField;
    private JButton btnAdd;
    private JButton btnEquals;

    private double sum = 0;   // cumulative total

    public AdditionTest() {
        super("Addition Test");

        inputField = new JTextField(10);
        btnAdd = new JButton("+");
        btnEquals = new JButton("=");

        // Layout
        setLayout(new FlowLayout());
        add(inputField);
        add(btnAdd);
        add(btnEquals);

        // + button logic
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText().trim();
                if (!text.isEmpty()) {
                    double value = Double.parseDouble(text);
                    sum += value;
                    inputField.setText("");   // clear after reading
                }
            }
        });

        // = button logic
        btnEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Cumulative Sum: " + sum
                );
            }
        });

        // Window close behavior
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdditionTest();
    }
}
