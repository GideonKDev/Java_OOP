package Java_OOP.JavaGUI;
import javax.swing.JOptionPane;

public class DialogueBoxes {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"Welcome to Java GUI");

        // Input names and calculate age
        String name = JOptionPane.showInputDialog("Enter Name: ");
        int year = Integer.parseInt(JOptionPane.showInputDialog(null,name+" When Were you Born","Year Of Birth", JOptionPane.WARNING_MESSAGE));

        //take in the current year of Birth:
        int currentYear = Integer.parseInt(JOptionPane.showInputDialog("Current Year: "));

        int age = currentYear - year;
        JOptionPane.showMessageDialog(null,"Age: "+age);

        //Developing a dropDown for the country
        Object[] countries = {"Kenya", "Uganda","Tanzania", "Somalia","South Africa"};
        String country = (String) JOptionPane.showInputDialog(null, "Select Country:", "Country Selection", JOptionPane.PLAIN_MESSAGE, null, countries, countries[0]);
        JOptionPane.showMessageDialog(null,"You are from "+country);

        // confirm dialogue 
        int feedback = JOptionPane.showConfirmDialog(null, "Are you sure you want to terminate ?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (feedback == 0){
                System.exit(0);
            }
    }
}
