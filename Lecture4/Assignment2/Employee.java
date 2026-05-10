package Java_OOP.Lecture4.Assignment2;

abstract  class Employee {
    private String name;
    private String employeeNumber;

    public Employee(String name, String employeeNumber) {
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public String getName(){
        return name;
    }

    public String getNum(){
        return employeeNumber;
    }
    
    abstract double calculatePay();
   
    public void displayDetails(){
        System.out.println("Name: "+getName());
        System.out.println("Employee ID: "+getNum());     
    };
}
