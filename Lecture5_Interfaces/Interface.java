package Java_OOP.Lecture5_Interfaces;

public interface  Interface{
    public String NAME = "Master";
    // public void methodDemo(){};
    public abstract void Demo(); // correct way to create methods 
    int demoMethod(); //error




}
//interface can extend each other
interface Demo extends Interface{
    String Demo_function();
}


// classes cannot extend Interfaces but they implement them
class DemoClass implements Interface{
    
    @Override
    public void Demo(){
        System.out.println(NAME);
    }

    @Override
    public int demoMethod(){
        return 0;
    }
}

//you cannot Implement then extend but you can extend then implement
class Student  extends DemoClass implements Interface{

}