package Java_OOP.Lecture5;
// import java.util.Scanner;
public class StudentAccount extends Account {
    private String regNo;
    private String institution;
    // private Scanner input = new Scanner(System.in);

    public StudentAccount(){    
        super();
        System.out.print("Reg No: ");
        regNo = input.nextLine();
        input.nextLine();

        System.out.print("Institution: ");
        institution = input.nextLine();
    }

    @Override
    public void withdraw(){
        System.out.println("Enter Amount you wish to Withdraw: ");
        
        try{
            double amountWithdrawn = input.nextDouble();
            if (amountWithdrawn > accBalance) {
                throw new Exception("Insufficient funds");
            } else {
                accBalance = accBalance - amountWithdrawn;
                System.out.println("Amount Withdrawn: " + amountWithdrawn);
                System.out.println("New Balance: " + accBalance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
    
    @Override
    public void deposit(){
        super.deposit();
    }

    @Override
    public void checkBalance(){
        super.checkBalance();
    }

    




}
