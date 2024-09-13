// The Collection Interface Example
import java.util.*;

public class CollectionInterfaceExample {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("One");
        collection.add("Two");
        collection.add("Three");
        collection.add("Four");
        Iterator<String> iter = collection.iterator();

        Collections.reverse(collection);

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        // for (String element : collection) {
        //     System.out.println(element);
        // }
    }
}
