/*
Exercise 1: Password Strength Analyzer and Generator
Scenario
A cybersecurity firm is developing a password management tool. They need a Java program that can analyze password strength and generate strong random passwords. 
The program should evaluate passwords based on specific criteria and provide feedback to users.

Requirements
    Part A: Password Strength Analyzer
Create a method analyzePassword(String password) that evaluates a password and returns a strength rating ("Weak", "Moderate", "Strong", "Very Strong") based on the following criteria:
Criteria	Points
Length ≥ 8 characters	1 point
Contains at least one uppercase letter (A-Z)	1 point
Contains at least one lowercase letter (a-z)	1 point
Contains at least one digit (0-9)	1 point
Contains at least one special character (!@#$%^&*)	1 point
Strength Classification:
•	0-2 points: "Weak"
•	3 points: "Moderate"
•	4 points: "Strong"
•	5 points: "Very Strong"

    Part B: Password Generator
Create a method generatePassword(int length, boolean useSpecialChars) that 
generates a random password of the specified length. The password should include a mix of uppercase letters, 
lowercase letters, and digits. If useSpecialChars is true, include special characters from the set !@#$%^&*.

    Part C: Password Validator with Retry
Write a main program that:
1.	Prompts the user to enter a password
2.	Analyzes and displays its strength
3.	If the password is "Weak", prompt the user to try again (maximum 3 attempts)
4.	After successful validation or maximum attempts, generate and display a strong password suggestion using the generator method
*/
import java.util.Random;
public class PasswordGenerator {
    public PasswordGenerator(){

    }
    public static String analyzePassword(String password){
        int point = 0;

        if(password.length()>=8){
            point++;
        }

        if(password.matches(".*[A-Z].*")){
            point++;
        }

        if(password.matches(".*[a-z].*")){
            point++;
        }

        if(password.matches(".*[0-9].*")){
            point++;
        }

        if(password.matches(".*[!@#$%^&*].*")){
            point++;
        }

         if (point <= 2) {
            return "Weak";
        } else if (point == 3) {
            return "Moderate";
        } else if (point == 4) {
            return "Strong";
        } else {
            return "Very Strong";
        }

    }
    public static String generatePassword(int length, boolean useSpecialChars){
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*";

        String allChars = upper+lower+digits;
        if(useSpecialChars){
            allChars = allChars + special; 
        }

        Random rand = new Random();
        String password = " ";

        for (int i = 0; i<=length; i++){
            int index = rand.nextInt(allChars.length());
            password = password + allChars.charAt(index);
        }

        return password;

    }

}
