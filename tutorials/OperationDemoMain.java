package Java_OOP.tutorials;

public class OperationDemoMain {
    public static void main(String[] args) {
        OperationDemo add = (a,b)-> a+b;
        OperationDemo multipy = (a,b)->a*b;

        
        System.out.println(add.apply(3,4));
        System.out.println(multipy.apply(4, 5));
    }
}