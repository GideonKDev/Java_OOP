package Java_OOP.Lecture5;
import java.util.Scanner;
abstract class Account {
    protected int accNumber;
    protected String accHolder;
    protected double accBalance;
    protected Scanner input = new Scanner(System.in);

    public Account(){
        System.out.println("Account Name: ");
        accHolder = input.nextLine();

        System.out.println("Account Number: ");
        accNumber = input.nextInt();

        accBalance = 0;

    }

    public void deposit(){
        System.out.println("Amount to be Deposited: ");
        double amountDeposit = input.nextDouble();
         accBalance = accBalance + amountDeposit;
         System.out.println("Amount Deposited: "+amountDeposit);
         System.out.println("New Balance: "+accBalance);
    }

    abstract void withdraw();

    public void checkBalance(){
        System.out.println("Account Balance: "+accBalance);
    }
}
