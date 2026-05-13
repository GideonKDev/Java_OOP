package Java_OOP.Lecture4.Assignment2;

import java.util.*;

public class EmployeePaymentSystem {
    private Map<String, Employee> employees;
    private Scanner scanner;

    public EmployeePaymentSystem() {
        employees = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        EmployeePaymentSystem system = new EmployeePaymentSystem();
        system.run();
    }

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    addCasualEmployee();
                    break;
                case 2:
                    addPermanentEmployee();
                    break;
                case 3:
                    showPayByNumber();
                    break;
                case 4:
                    showAllEmployees();
                    break;
                case 5:
                    removeEmployee();
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\n========== EMPLOYEE PAYMENT SYSTEM ==========");
        System.out.println("1. Add Casual Employee");
        System.out.println("2. Add Permanent Employee");
        System.out.println("3. Show Pay by Employee Number");
        System.out.println("4. Show All Employees");
        System.out.println("5. Remove Employee");
        System.out.println("6. Exit");
        System.out.println("============================================");
    }

    private void addCasualEmployee() {
        System.out.println("\n--- Add Casual Employee ---");
        String name = getStringInput("Enter employee name: ");
        String employeeNumber = getStringInput("Enter employee number: ");

        // Check if employee number already exists
        if (employees.containsKey(employeeNumber)) {
            System.out.println("Error: Employee number already exists!");
            return;
        }

        int daysWorked = getIntInput("Enter days worked: ");
        if (daysWorked < 0) {
            System.out.println("Error: Days worked cannot be negative!");
            return;
        }

        double commissionPerDay = getDoubleInput("Enter commission per day: ");
        if (commissionPerDay < 0) {
            System.out.println("Error: Commission cannot be negative!");
            return;
        }

        CasualEmployee casual = new CasualEmployee(name, employeeNumber, daysWorked, commissionPerDay);
        employees.put(employeeNumber, casual);
        System.out.println("Casual employee added successfully!");
    }

    private void addPermanentEmployee() {
        System.out.println("\n--- Add Permanent Employee ---");
        String name = getStringInput("Enter employee name: ");
        String employeeNumber = getStringInput("Enter employee number: ");

        // Check if employee number already exists
        if (employees.containsKey(employeeNumber)) {
            System.out.println("Error: Employee number already exists!");
            return;
        }

        double monthlySalary = getDoubleInput("Enter monthly salary: ");
        if (monthlySalary < 0) {
            System.out.println("Error: Salary cannot be negative!");
            return;
        }

        PermanentEmployee permanent = new PermanentEmployee(name, employeeNumber, monthlySalary);
        employees.put(employeeNumber, permanent);
        System.out.println("Permanent employee added successfully!");
    }

    private void showPayByNumber() {
        System.out.println("\n--- Show Pay by Employee Number ---");
        String employeeNumber = getStringInput("Enter employee number: ");

        if (!employees.containsKey(employeeNumber)) {
            System.out.println("Error: Employee not found!");
            return;
        }

        Employee employee = employees.get(employeeNumber);
        System.out.println("\nEmployee: " + employee.getName());
        System.out.println("Employee ID: " + employee.getNum());
        System.out.println("Pay: " + employee.calculatePay());
    }

    private void showAllEmployees() {
        System.out.println("\n--- All Employees ---");

        if (employees.isEmpty()) {
            System.out.println("No employees in the system.");
            return;
        }

        for (Employee employee : employees.values()) {
            System.out.println("\n" + employee.toString());
        }
    }

    private void removeEmployee() {
        System.out.println("\n--- Remove Employee ---");
        String employeeNumber = getStringInput("Enter employee number to remove: ");

        if (!employees.containsKey(employeeNumber)) {
            System.out.println("Error: Employee not found!");
            return;
        }

        employees.remove(employeeNumber);
        System.out.println("Employee removed successfully!");
    }

    private String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private int getIntInput(String prompt) {
        System.out.print(prompt);
        try {
            int value = Integer.parseInt(scanner.nextLine().trim());
            return value;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return getIntInput(prompt);
        }
    }

    private double getDoubleInput(String prompt) {
        System.out.print(prompt);
        try {
            double value = Double.parseDouble(scanner.nextLine().trim());
            return value;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return getDoubleInput(prompt);
        }
    }
}
