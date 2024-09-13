// Using Iterators Example
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        // Creating an array of string
        // Length of an array is FIXED
        String[] strinArr = {"s1", "s2", "s3"};

        // Creating and adding elements to the ArrayList
        ArrayList<String> Arrlist = new ArrayList<String>();
        Arrlist.add("Banana");
        Arrlist.add("Apple");
        Arrlist.add("Grapes");


        // Now you want to print all the elements inside the list
        Iterator<String> iterator = Arrlist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}