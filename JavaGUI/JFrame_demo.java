package Java_OOP.JavaGUI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JFrame_demo extends JFrame {
    JLabel lblHeading,lblUsername, lblPassword;
    JButton btnLogin, btnCancel;

    JTextField txtUsername = new JTextField(20);
    JPasswordField pwtPassword = new JPasswordField(20);

    public void sample(){
        //super("Login Form");
        lblHeading  = new JLabel("Students System");
        lblUsername = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        setVisible(true);
        setSize(400, 300);
        setLayout(new FlowLayout());

        //displaying the interfaces
        add(lblHeading);
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(pwtPassword);
        add(btnLogin);
        add(btnCancel);

    }

    public static void main(String[] args) {
        JFrame_demo frame = new JFrame_demo();
        frame.sample();
    }

}
