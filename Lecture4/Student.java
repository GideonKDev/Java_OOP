package Java_OOP.Lecture4;

class Student extends Person{
    private String regNo;
    private double feebalance;

   public Student(String name, String gender, String regNo, double feebalance){
    super(name, gender);
    this.regNo = regNo;
    this.feebalance = feebalance;
   }
   public void setReg(){
    System.out.print("Reg No: ");
    regNo = input.nextLine();
   }
   public void setfeeBal(){
    System.out.println("Fee Balance: ");
    feebalance = input.nextDouble();
   }

   public String getReg(){
    return regNo;
   }

   public Double getFeeBal(){
    return feebalance;
   }
}
