// Throwing Exceptions Example
class JavaMentorException extends Exception {
    public JavaMentorException(String message){
        super(message);
    }
}

public class ThrowingExceptionsExample {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception{
        if (age < 18) {
            throw new Exception("Age must be 18 or older.");
            // try{
            // }
            // catch(Exception e){
            //     System.out.println("Anything");
            // }
        }
    }
}