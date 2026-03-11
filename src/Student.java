public class Student {
    private String name;
    private int age;

    //constructor
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Hello "+name+" You are "+age+" Years Old");
    }
}
