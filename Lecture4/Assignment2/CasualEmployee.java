package Java_OOP.Lecture4.Assignment2;

public class CasualEmployee extends Employee {
    private double commissionPerDay;
    private int days;
    public CasualEmployee(String name, String employeeNumber){
        super(name,employeeNumber);
    }

    @Override
    public double calculatePay(){
        return days * commissionPerDay;
    }

    @Override
    public void displayDetails(){
        
        e
    }
}
