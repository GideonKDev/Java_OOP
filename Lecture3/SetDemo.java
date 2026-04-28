package Java_OOP.Lecture3;

// import java.lang.ref.SoftReference;
import java.util.*;
public class SetDemo {
    public void SetDemo(){
        HashSet<Integer> unsorted = new HashSet<>();
        TreeSet<Integer> sorted = new TreeSet<>();

        unsorted.add(10);
        sorted.add(10);

        unsorted.add(40);
        sorted.add(40);

        unsorted.add(6);
        sorted.add(6);

        System.out.println("Unsorted: "+unsorted);
        System.out.println("Sorted: "+sorted);
    }
  
    public static void main(String[] args) {
        SetDemo d = new SetDemo();
        d.SetDemo();
    }

}
