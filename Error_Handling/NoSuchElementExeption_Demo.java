package Java_OOP.Error_Handling;

//This throws a NoSuchElementExeption because there are 

import java.util.Hashtable;
import java.util.Set;
import java.util.HashSet;

// no elements in the set and the Hashtable and we are trying to access elements

public class NoSuchElementExeption_Demo {
    public static void main(String[] args) {
        Set<String> exampleSet = new HashSet<>();
        Hashtable<Integer, String> exampleTable = new Hashtable<>();

        // add elements so calling next() / nextElement() won't throw NoSuchElementException
        // exampleSet.add("one");
        // exampleTable.put(1, "one");

        System.out.println(exampleSet.iterator().next());
        System.out.println(exampleTable.elements().nextElement());
    }
}
