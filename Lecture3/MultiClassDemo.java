package Java_OOP.Lecture3;
import java.util.*;//importing the entire package

import Java_OOP.tutorials.Hashmaps;
// import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
class Exception_Demo{
    public void tryDemo(){
        int val2,val1;
        float result;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the fisrt Value: ");
            val2 = input.nextInt();

            System.out.print("Enter the second Value: ");
            val1 = input.nextInt();

            result= val2/val1;

            System.out.println("Result = "+result);

        }catch(InputMismatchException e){
            System.out.println("Error occured: "+e.getMessage());
        }catch(ArithmeticException f){
            System.out.println("Division by Zero not allowed::"+f.getMessage());
        }catch(Exception e){
            System.out.println(e+" Occured");
        }
        finally{
            System.out.println("End of Try Catch exception");
        }
        input.close();

    }
}

class Collection_Demo{
    public void listDemo(){
        String name;
        Scanner input  = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        for( int i = 0; i < 3 ;i++){
            System.out.print("Enter name "+(i+1)+": ");
            name = input.nextLine();
            names.add(name);
        }

    System.out.println("Names: "+names);
    names.add("Alice");
    names.add(2,"Peter");


     System.out.println("New Names: "+names);
     names.set(3, "Set Name");// replaces the index with the required element

     System.out.println("New Names with index three set: "+names);


    }
    public void SetDemo(){
        HashSet<Integer> unsorted = new HashSet<>();
        TreeSet<Integer> sorted = new TreeSet<>();

        unsorted.add(10);
        sorted.add(10);

        unsorted.add(40);
        sorted.add(40);

        unsorted.add(6);
        sorted.add(6);

        System.out.println("Unsorted: "+unsorted);
        System.out.println("Sorted: "+sorted);
    }

    public void mapsDemo(){
        HashMap<Integer,String > courses = new HashMap<>();
        courses.put(101, "Computing introduction");
        courses.put(105,"Programming" );
        courses.put(103, "Software Engineering");

        System.out.println("Courses on Offer: "+courses);



    }

}

public class MultiClassDemo {
    public static void main(String[] args) {
        // Exception_Demo p = new Exception_Demo();
        // p.tryDemo();

        Collection_Demo p = new Collection_Demo();
        // p.listDemo();
        p.mapsDemo();

    }

    // private class Demo{

    // }
}
