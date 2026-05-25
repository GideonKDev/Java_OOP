package Java_OOP.tutorials.Exam_Revision;
/*
searchMember()- user Keys in the name and the system checks whether the name is on the list,
viewMember()- To list all members in the least using a loop
*/
import java.util.Scanner;

public class MemberList {
    private String[] names;
    private Scanner input = new Scanner(System.in);


    public MemberList(){
        names = new String[10];
        System.out.println("Enter the Name of the Members: ");
        for (int i = 0; i< names.length; i++){
            System.out.print((i+1)+". ");
            String name = input.nextLine();
             names[i] = name;
        }
    }

    public void searchMember(){
        boolean result;
        System.out.println("Enter the name of the member to search for: ");
        String SearchName = input.nextLine();

        for(String s: names){
            if (SearchName.equalsIgnoreCase(s)){
                System.out.println("Name Found: "+s);
                result = true;
                System.err.println(result);
            }
        }
    }


    public void viewMembers(){
        System.out.println("All Members");
        for (String M: names){
            System.out.println(M);
        }
    }

    public static void main(String[] args) {
        MemberList m = new MemberList();
        m.searchMember();    
    }
}
