package Java_OOP.Error_Handling;
import java.util.Scanner;

public class IOExeption_Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner("Hello world");
        System.out.println(""+ input.nextLine());

        //check if there is an IO exeption
        System.out.println("Exeption Output: "+input.ioException());
        input.close();
    }
}
