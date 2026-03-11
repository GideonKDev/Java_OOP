
import java.util.Scanner;
import javax.naming.event.NamingExceptionEvent;
public class Student {
  /*
  Problem 2: Student Class
        Create a Student class with:
        Private fields: name, rollNumber, marks (in 3 subjects)
        Constructor to initialize all fields
        Method calculatePercentage() returns average
        Method displayGrade() returns 'A' (>80%), 'B' (60-80%), 'C' (40-60%), 'F' (<40%) */
    private String name;
    private String rollNumber;
    private int[] marks = new int[3];
    private int total=0;

    public Student(String name, String rollNumber, int[] marks) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.marks = marks; // This assigns the array passed in to your private field
    }

  public double calculatePercentage() {
        int total = 0;
        for (int m : marks) { // This is a "for-each" loop in Java, very clean!
            total += m;
        }
        return total / 3.0; // Returns the average
    }

    public String displayGrade(){
        
    }



}
