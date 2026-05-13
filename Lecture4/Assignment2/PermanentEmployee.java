package Java_OOP.Lecture4.Assignment2;

public class PermanentEmployee extends Employee {
    private double monthlySalary;

    public PermanentEmployee(String name, String employeeNumber, double monthlySalary) {
        super(name, employeeNumber);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Total Pay: " + calculatePay());
    }
}
