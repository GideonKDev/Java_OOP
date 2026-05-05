/**
 * @author Master Kirui
 * 
 */

package Java_OOP.Assignment;
import java.util.*;

public class Student {
    private int id;
    private String name;
    private String mail;
    private Scanner input = new Scanner(System.in);

    public void addStudent(){
        //no duplicate IDs
        System.out.print("Enter Student ID: ");
        id = input.nextInt();
        System.out.print("Enter Student Name: ");
        name = input.nextLine();
        System.out.print("Enter Student Email: ");
        mail = input.nextLine();

        

    }

    public void enrollCourse(){

    }

    public void recordGrade(){

    }

    public void generateReport(){

    }
    
    public void search(){

    }

    public void calculate(){
        
    }
}
