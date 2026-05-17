package Java_OOP.tutorials;
import java.util.*;


public class HashMap3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<String, Integer> users =  new HashMap<String, Integer>();
       
       for( int i = 0; i< 3 ; i++){
            System.out.print("Enter Name for user "+(i+1)+": ");
            String name =input.nextLine();
            System.out.print("Enter ID for "+name+": ");
            int Id = input.nextInt();
            input.nextLine();

            users.put(name, Id);
        }    

        System.out.println("Check ID number for a specific name");
        System.out.println("Enter name: ");
        String checkName = input.nextLine();

        int answer = users.get(checkName);
        System.out.println(answer);
    }
}
