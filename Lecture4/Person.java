package Java_OOP.Lecture4;
import java.util.Scanner;

public class Person {
    protected String name;
    protected String gender;
    protected static Scanner input = new Scanner(System.in);


    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    public void setName(){
        System.out.print("Name: ");
        name = input.nextLine();
    }

    public void setGender(){
        System.out.print("Gender: ");
        gender = input.nextLine();
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }
    
    public void displayDetails(){
    System.out.println("Name: "+name);
    System.out.println("Gender: "+gender);
   }
}
