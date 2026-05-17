package Java_OOP.tutorials;
import java.util.*;
public class Hashmaps {
    //this is a hashmap tutorial
    public static void main(String[] args){

        HashMap<String, String> cities = new HashMap<String, String>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Country "+(i+1)+": ");    
            String country = input.nextLine();
            System.out.print("Enter Capital of "+country+": ");
            String capital = input.nextLine();
            cities.put(country, capital);
        }
        
        System.out.println("Countries and their Capitals:");
        for (Map.Entry<String, String> entry : cities.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        
    }
}
