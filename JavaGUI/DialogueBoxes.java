package Java_OOP.JavaGUI;
import javax.swing.JOptionPane;

public class DialogueBoxes {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Welcome to Java GUI");

        //Input names and calculate age
        String name = JOptionPane.showInputDialog("Enter Name: ");
        int year = Integer.parseInt(JOptionPane.showInputDialog(null,name+" When Were you Born","Year Of Birth", JOptionPane.WARNING_MESSAGE));

        //take in the current year of Birth:
        int currentYear = Integer.parseInt(JOptionPane.showInputDialog("Current Year: "));

        int age = currentYear - year;
        JOptionPane.showMessageDialog(null,"Age: "+age);

        //Developing a dropDown
        

    }
}
