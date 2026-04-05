/*
   Part C: Password Validator with Retry
Write a main program that:
1.	Prompts the user to enter a password
2.	Analyzes and displays its strength
3.	If the password is "Weak", prompt the user to try again (maximum 3 attempts)
4.	After successful validation or maximum attempts, generate and display a strong password suggestion using the generator method
*/


import java.util.Scanner;
public class PasswordGeneratorMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      int attempts = 0;
      String passVerified = "";

      while(attempts<3){
        System.out.print("Enter New Password: ");
        String pass = input.nextLine();

        passVerified = PasswordGenerator.analyzePassword(pass);
        System.out.println("Password Strength: "+passVerified);

        if(!passVerified.equals("Weak")){
            break;
        }
        attempts++;
        if(attempts<3){
            System.out.println("Password is weak.. Try again");
        }
      }
    if (passVerified.equals("Weak")) {
        System.out.println("\nMaximum attempts reached.");
    }
    
    if(attempts == 3){
    System.out.println("\nGenerating a strong password suggestion:");
    String newPass = PasswordGenerator.generatePassword(8, true);
    System.out.println("Suggested Password: " + newPass);
    }
    
    input.close();

}
}