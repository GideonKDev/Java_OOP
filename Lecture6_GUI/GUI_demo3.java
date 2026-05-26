package Java_OOP.Lecture6_GUI;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI_demo3 extends JFrame implements ActionListener{

    //create a private datatypes that can be referrenced and use the naming convention
    private final JButton btnExit = new JButton("Exit");
    private final JPasswordField pwfPass = new JPasswordField(20);
    private final JLabel lblPass = new JLabel("Password: ");


    public GUI_demo3(){
        super("New GUI Instance");
        // JOptionPane.showMessageDialog(this,"Welcome to Java Forms");

        setVisible(true);
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //create a sample login form
        JLabel caption = new JLabel("Username: ");
        add(caption);  //named controll, can be referenced anywhere in the code
        
        //unamed components are not referenced anymore
        add(new JTextField(20)); add(lblPass);add(pwfPass);add(btnExit);
        add(new JButton("Login"));
            
        //adding the private button declared outside the function
        btnExit.addActionListener(this);
        add(btnExit);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        int x = JOptionPane.showConfirmDialog(this,"Are you sure you want to exit? ");
        if(x == 0){
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new GUI_demo3();
    }
}