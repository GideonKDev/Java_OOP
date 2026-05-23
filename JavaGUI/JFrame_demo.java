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
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Heading
        lblHeading = new JLabel("Students System", SwingConstants.CENTER);
        lblHeading.setFont(new Font("Arial", Font.BOLD, 20));
        lblHeading.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(lblHeading, BorderLayout.NORTH);

        // Form panel - using BoxLayout for better control
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        
        // Username row
        JPanel usernamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        lblUsername = new JLabel("Username:");
        lblUsername.setPreferredSize(new Dimension(80, 25));
        txtUsername = new JTextField(15);
        txtUsername.setMaximumSize(new Dimension(150, 25));
        txtUsername.setPreferredSize(new Dimension(150, 25));
        usernamePanel.add(lblUsername);
        usernamePanel.add(txtUsername);
        
        // Password row
        JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        lblPassword = new JLabel("Password:");
        lblPassword.setPreferredSize(new Dimension(80, 25));
        pwtPassword = new JPasswordField(15);
        pwtPassword.setMaximumSize(new Dimension(150, 25));
        pwtPassword.setPreferredSize(new Dimension(150, 25));
        passwordPanel.add(lblPassword);
        passwordPanel.add(pwtPassword);
        
        formPanel.add(usernamePanel);
        formPanel.add(passwordPanel);
        
        add(formPanel, BorderLayout.CENTER);

        // Buttons panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
        
        btnLogin.setPreferredSize(new Dimension(80, 30));
        btnCancel.setPreferredSize(new Dimension(80, 30));

        buttonPanel.add(btnLogin);
        buttonPanel.add(btnCancel);
        
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JFrame_demo());
    }
}