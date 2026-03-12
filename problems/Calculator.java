public class Calculator {
    /*
    Problem 10: Simple Calculator
        Create a Calculator class with:
        No fields needed
        Methods: add(a, b), subtract(a, b), multiply(a, b), divide(a, b) (handle division by zero)
        Each method should be overloaded for int and double parameters
    */
   
   // Integer versions
   public int add(int a, int b){
        return a + b;
   }
   
   public int subtract(int a, int b){
        return a - b;
   }
   
   public int multiply(int a, int b){
        return a * b;
   }
   
   public double divide(int a, int b){
        if(b == 0){
            System.out.println("Error: Cannot divide by zero!");
            return 0; // or you could throw an exception
        }
        return (double) a / b; // Cast to double for precise division
   }

   // Double versions
   public double add(double a, double b){
        return a + b;
   }
   
   public double subtract(double a, double b){
        return a - b;
   }
   
   public double multiply(double a, double b){
        return a * b;
   }
   
   public double divide(double a, double b){
        if(b == 0){
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
   }
}