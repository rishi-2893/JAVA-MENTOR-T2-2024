public class ArraysExample {
    public static void main(String[] args) {
        // I want to create an array of integers
        int[] numbers = {4, 9, 11, 100};

        // How to access the elements of the above array?
        System.out.println(numbers[2]);

        // System.out.println(numbers[-1]); // This gives ERROR
        System.out.println(numbers[numbers.length - 1]);
    }
}