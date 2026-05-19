package Java_OOP.Error_Handling;

public class NumberFormart_Demo {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("Hello");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
