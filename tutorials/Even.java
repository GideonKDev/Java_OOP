package Java_OOP.tutorials;

public class Even {

    public static void evenChecker(){
    for (int i = 0; i<=20 ; i++){
        if(i%2==0){
            System.out.println(i);
        }
    }
   }

   public static void do_evenChecker(){
   int i = 0;
        
        do {
            if (i%2==0){
                System.out.println(i);
            }
            i++;
            
        } while (i<=20);
    }

    public static void playbook(){
        String name = new String("Collins");
        // String name = "Collins";
        // System.out.println(name);
        name = "Gideon";
        System.out.println(name);
    }

 

   public static void main(String[] args) {
    //   Even.evenChecker();
    //   Even.do_evenChecker();
    Even.playbook();
   }
}
