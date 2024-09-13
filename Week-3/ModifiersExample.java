class Example {
    // This can be accessed outside this Example class using the example created
    public String publicField = "Public Field";

    // This CANNOT be accessed outside this class using the example object
    private String privateField = "Private Field";

    // Static keyword helps the user to access the attributes and the methods 
    // without creating instance (object) of the class
    static String staticField = "Static Field";

    // Variables declared using `final` keyword CANNOT be changed
    final String finalField = "Final Field";

    public void printsPrivateField(){
        // You can use this within this class but not outside
        System.out.println(privateField);
    }

    public void publicMethod() {
        System.out.println(publicField);
    }

    private void privateMethod() {
        System.out.println(privateField);
    }

    // This method can be invoked directly from the class name
    static void staticMethod() {
        System.out.println(staticField);
    }

    void finalMethod() {
        System.out.println(finalField);
    }
}

public class ModifiersExample {
    public static void main(String[] args) {
        Example example = new Example();

        // Accessing the publicField
        System.out.println(example.publicField);

        // Trying to print the privateField
        // System.out.println(example.privateField); // This gives ERROR
        // Example.privateField; // gives ERROR

        System.out.println(Example.staticField);
        Example.staticMethod();
    }
}