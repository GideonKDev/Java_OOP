
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class HashMaps_Problem {
   public static void main(String[] args) {
       HashMap<String, Integer> students = new HashMap<String, Integer>();
       Scanner input = new Scanner(System.in);
       students.put("Master",80);
       students.put("Molly",70);
       students.put("Mary",50);

       //search by Name;
       System.out.println("Enter Name: ");
       String checkname = input.nextLine();
    try{
       Integer answer = students.get(checkname);
       if (answer == null){
        throw new NoSuchElementException("Element not Found: "+checkname);
       }
       System.out.println(answer);
    }catch(NoSuchElementException e){
        System.out.println(e.getMessage());
    }
   } 
}
