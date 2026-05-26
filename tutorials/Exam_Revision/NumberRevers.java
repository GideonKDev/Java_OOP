package Java_OOP.tutorials.Exam_Revision;
import java.util.Scanner;

public class NumberRevers {
 //program to take in 10 numbers and reverse them
    int[] numbers = new int[10];
    private Scanner input = new Scanner(System.in);

    public void capture(){
        for(int i = 0; i<numbers.length; i++){
            System.out.println("Enter "+(i+1)+" :");
            int n = input.nextInt();
            numbers[i]=n;
        }
    }

    public void display(){
        for(int i = 9; i>=0; i--){
            System.out.println("Number "+(i+1)+": "+numbers[i]);
        }
    }

    public static void main(String[] args){
        NumberRevers m = new NumberRevers();
        m.capture();
        m.display();
    }
}
