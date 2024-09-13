class GenericFunctionExample {
    public static void print(Object obj){
        System.out.println(obj.toString());
    }
}

public class TwoClasses {
    public static void main(String[] args) {
        GenericFunctionExample.print("Hello, World!");
        GenericFunctionExample.print(123);
        GenericFunctionExample.print(45.67);
    }
}