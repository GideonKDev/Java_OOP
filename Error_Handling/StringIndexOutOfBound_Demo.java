package Java_OOP.Error_Handling;

public class StringIndexOutOfBound_Demo {
    public static void main(String[] args) {

        try {
            String a = "Vehicle";
            char c = a.charAt(8);
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            

    }
}
