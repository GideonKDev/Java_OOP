package Java_OOP.Lecture6_GUI;

import javax.swing.JOptionPane;

public class GUI_demo1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null," Enter Name: ","Username",JOptionPane.WARNING_MESSAGE);

       // Parent component(Container, but since it is null, it treat the screen as the parent formart), Message, Title, Icon;
        int yob = Integer.parseInt(JOptionPane.showInputDialog(name+"'s Year of Birth: "));
        int currentYear = Integer.parseInt(JOptionPane.showInputDialog("Current Year: "));
        int year = currentYear - yob;

        JOptionPane.showMessageDialog(
                    null,
                    "You are: "+year+"'s old"
                );
                
        //trying to exit the programme
        int K = JOptionPane.showConfirmDialog(
            null,
            "Do wish to terminate the erminate the programme? "
            );

        if(K == 0){
            System.exit(5);
        }
        //creating a dropdown

        Object[] ageGroup = {"child","Teenager","Youth","adult"};
        String ageCategory = (String) JOptionPane.showInputDialog(
                null,
                "Choose Age Group",
                "Age Selection",
                JOptionPane.PLAIN_MESSAGE,
                null,
                ageGroup,
                ageGroup[2]
            );
        
        Object[] options={"Rainy","Cloudy","Sunny"};//returns a number for the button clicked

        int condition = JOptionPane.showOptionDialog(
                null,
                "How is the weather Today",
                "Weather Dialogue",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]

            );

        String dayWeather;

        if(condition == 0){
            dayWeather = "Rainy Day, Carry Umbrella";
        }else if(condition == 1){
            dayWeather = "Cloudy Day,Vaa Sweater Buana";
        }else{
            dayWeather = "Sunny Day, Enda Swimmo";
        }

        JOptionPane.showMessageDialog(null, dayWeather); 
        

    }
    
}
