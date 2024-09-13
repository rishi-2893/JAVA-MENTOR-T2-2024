public class GenericFunctionExample {
    // AIM: We want to create a `print` function which takes an argument of 
    // type String, integer or double and prints the value to the console
    public static void print(Object obj){
        System.out.println(obj.toString());
    }

    public static void main(String[] args) {
        print("Hello, World!");
        print(123);
        print(45.67);
    }
}


