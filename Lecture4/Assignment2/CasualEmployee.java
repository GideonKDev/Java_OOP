package Java_OOP.Lecture4.Assignment2;

public class CasualEmployee extends Employee {
    private double commissionPerDay;
    private int daysWorked;

    public CasualEmployee(String name, String employeeNumber, int daysWorked, double commissionPerDay) {
        super(name, employeeNumber);
        this.daysWorked = daysWorked;
        this.commissionPerDay = commissionPerDay;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public double getCommissionPerDay() {
        return commissionPerDay;
    }

    public void setCommissionPerDay(double commissionPerDay) {
        this.commissionPerDay = commissionPerDay;
    }

    @Override
    public double calculatePay() {
        return daysWorked * commissionPerDay;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Days Worked: " + daysWorked);
        System.out.println("Commission Per Day: " + commissionPerDay);
        System.out.println("Total Pay: " + calculatePay());
    }
}
