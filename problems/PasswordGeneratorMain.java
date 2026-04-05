import java.util.Scanner;
public class PasswordGeneratorMain {
    public static void main(String[] args){
      // PasswordGenerator p = new PasswordGenerator();
       Scanner input = new Scanner(System.in);

       System.out.print("Enter Password: ");
       String pass = input.nextLine();
       
       String passVerified = PasswordGenerator.analyzePassword(pass);
       System.out.println("Password is : "+passVerified+". ");
    }
}
