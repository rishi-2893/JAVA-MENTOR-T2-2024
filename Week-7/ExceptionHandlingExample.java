public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10/0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exceptionObject) {
            // System.out.println("Error: Division by zero is not allowed.");
            System.out.println(exceptionObject.getMessage());
            System.out.println(exceptionObject.getCause());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}