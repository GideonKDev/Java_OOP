package Java_OOP.Error_Handling;

public class NullPointer_Demo {
    public static void main(String[] args) {
        try{
            String a = null;// a  is null therefore returns an error by trying to display character at a given index
            System.out.println(a.charAt(0));
        }catch(NullPointerException e){
                System.out.println(e.getMessage());
        }
    }
}
