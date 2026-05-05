package Java_OOP.Lecture4;

public interface Lecture4main {
    public static void main(String[] args){
        Person p = new Person("Alice","Female");
        // p.setName();
        // p.setGender();
        p.displayDetails();
        Student m = new Student("Master", "Male", "Master2025", 5000);
        m.displayDetails();
    }
}
