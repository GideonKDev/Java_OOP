package Java_OOP.Error_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticException_Demo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter Numerator: ");
            double a = input.nextInt();

            System.out.println("Enter Denomenator: ");
            double b = input.nextInt();
            
            if (b==0){
                System.err.println("Cannot Devide a Number with Zero");
            }else{
                double c = a/b;
                System.out.println("Answer: "+c);
            }

        }catch (InputMismatchException e){
            System.out.println("Invalid Message.. Pliz insert Numbers and not names");
        }finally{
            System.out.println("The exeption Handles successfully");
        }
    }
}
