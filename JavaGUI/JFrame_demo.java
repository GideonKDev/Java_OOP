package Java_OOP.JavaGUI;

import java.awt.*;
import javax.swing.*;

public class JFrame_demo extends JFrame {

    private JLabel lblHeading, lblUsername, lblPassword;
    private JButton btnLogin, btnCancel;
    private JTextField txtUsername;
    private JPasswordField pwtPassword;

    public JFrame_demo() {
        setTitle("Login Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the window
        setLayout(new BorderLayout());

        // Heading
        lblHeading = new JLabel("Students System", SwingConstants.CENTER);
        lblHeading.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblHeading, BorderLayout.NORTH);

        // Form panel
        JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");

        txtUsername = new JTextField(20);
        pwtPassword = new JPasswordField(20);

        formPanel.add(lblUsername);
        formPanel.add(txtUsername);
        formPanel.add(lblPassword);
        formPanel.add(pwtPassword);

        add(formPanel, BorderLayout.CENTER);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        buttonPanel.add(btnLogin);
        buttonPanel.add(btnCancel);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame_demo();
    }
}
