import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        
        System.out.println("Sum: " + calc.add(num1, num2));
        System.out.println("Difference: " + calc.subtract(num1, num2));
        System.out.println("Product: " + calc.multiply(num1, num2));
        System.out.println("Quotient: " + calc.divide(num1, num2));
        
        input.close(); 
    }
}