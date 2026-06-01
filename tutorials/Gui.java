
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame {

    private final JTextField txtUsername;
    private final JPasswordField pwdPassword;

    public Gui() {
        super("Reality");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 400);
        setLocationRelativeTo(null);

        JLabel lblHeading = new JLabel("LOGIN PAGE");
        JLabel lblUserName = new JLabel("Username");
        txtUsername = new JTextField(15);
        JLabel lblPassword = new JLabel("Password");
        pwdPassword = new JPasswordField(15);
        JButton btnChange = new JButton("Change");
        JButton btnProceed = new JButton("Proceed");
        JButton btnExit = new JButton("Exit");

        add(lblHeading);
        add(lblUserName);
        add(txtUsername);
        add(lblPassword);
        add(pwdPassword);
        add(btnProceed);
        add(btnExit);
        add(btnChange);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = JOptionPane.showConfirmDialog(Gui.this,
                    "Are you sure you want to terminate the program?",
                    "Confirm Exit",
                    JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        btnProceed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(pwdPassword.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(Gui.this,
                        "Please enter username and password",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Gui.this,
                        "Welcome " + username + "!",
                        "Login Successful",
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btnChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText("");
                pwdPassword.setText("");
                txtUsername.requestFocus();
            }
        });

        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Create GUI on Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui();
            }
        });
    }
}
    
