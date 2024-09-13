public class TypeCastingExample {
    public static void main(String[] args) {
        double num = 10.5;

        // I want to convert above double into an integer
        int castedNum = (int) num; // 10

        System.out.println("Original double value: " + num);
        System.out.println("Casted integer value: " + castedNum);
    }
}