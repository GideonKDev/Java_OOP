import java.util.Scanner;
public class RectangleMain {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Length: ");
            double len = input.nextDouble();

            System.out.print("Width: ");
            double wid = input.nextDouble();

        Rectangle r = new Rectangle(len,wid);
        System.out.println("Area: "+r.getArea());
        System.out.println("Perimeter: "+r.getPerimeter());
        }

    }
}
