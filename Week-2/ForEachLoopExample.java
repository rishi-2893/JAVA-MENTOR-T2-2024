// Iterating over Elements Directly in Array
public class ForEachLoopExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // For-Each loop is used to iterate the values of the array
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        
        int[] numbers = {4, 9, 11, 100};
        for(int number : numbers){
            System.out.println(number);
        }
    }
}