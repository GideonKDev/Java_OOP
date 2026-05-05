package Java_OOP.Lecture4.Assignment;

import java.util.Scanner;
public class PolygonMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to System Polygon Calculator");
        System.out.println("1. Triangle\n2. Rectangle\n3. Circle ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("=======Triangle Dimensions========");
                System.out.print("base: ");
                double base = input.nextDouble();
                System.out.print("Height: ");
                double hight= input.nextDouble();

                Polygon t = new Triangle(base, hight);
                double area = t.area();
                double per = t.perimeter();

                System.out.println("========Results============");
                System.out.println("Area: "+area +"\nPerimeter: "+per);
                
                break;

            case 2:
                System.out.println("=======Rectangle Dimensions========");
                System.out.print("Length: ");
                double length = input.nextDouble();
                System.out.print("Width: ");
                double width = input.nextDouble();
                Polygon r = new Rectangle(length, width);
                double areaR = r.area();
                double perR = r.perimeter();
                System.out.println("========Results============");
                System.out.println("Area: "+areaR +"\nPerimeter: "+perR );
                break;

            case 3:
                System.out.println("=======Circle Dimensions========");
                System.out.print("Radius: ");
                double radius = input.nextDouble(); 
                Polygon c = new Circle(radius);
                double areaC = c.area();
                double perC = c.perimeter();
                System.out.println("========Results============");
                System.out.println("Area: "+areaC +"\nPerimeter: "+perC );
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                break;
                       
        }
        input.close();
    }

    
}
