package Java_OOP.Error_Handling;

import java.util.Scanner;

public class ArrayIndexOutOfBound_Demo {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int[] numbers = {10,20,30,40,50};

    try{
        System.out.println("Enter index to check for number: ");
        int i = input.nextInt();

        int num = numbers[i];
        System.out.println("Number at index "+i+" is "+num);

    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("The array is not that Longer :haha");
        System.out.println("This is the error "+e.getMessage());
    }
    finally{
        System.out.println("Error Handled successfully");
    }     
    }
  
}
