package Java_OOP.tutorials;
import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void arrayListInt(){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number "+(i+1)+": ");
            int number = input.nextInt();

            myNumbers.add(number);

        }
        Collections.sort(myNumbers);    
        System.out.println(myNumbers);

    }

    public static void arrayListString(){
        ArrayList<String> cars = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        for(int i=0; i<10;i++ ){
            System.out.print("Enter Brand "+(i+1)+":");
        String veh = input.nextLine();

            cars.add(veh);
        }
        Collections.sort(cars);
        System.out.println(cars);
       

    }
    public static void main(String[] args) {
        // Arraylist.arrayListInt();
        Arraylist.arrayListString();
    }
}
