package Java_OOP.Lecture4.Assignment;

import java.util.Scanner;
public class PolygonMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to System Polygon Calculator");
        System.out.println("1. Triangle\n2. Rectangle\n3. Circle ");

        int choice;

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
            default:
                throw new AssertionError();
        }
    }
    
}
