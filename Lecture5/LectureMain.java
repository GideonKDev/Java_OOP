package Java_OOP.Lecture5;

public class LectureMain {
    public static void main(String[] args) {
        StudentAccount m = new StudentAccount();
        m.deposit();
        m.checkBalance();

        m.withdraw();
        m.checkBalance();
    }
}
