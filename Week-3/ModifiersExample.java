// Java Modifiers Example
class Example {
    public String publicField = "Public Field";
    private String privateField = "Private Field";
    static String staticField = "Static Field";
    final String finalField = "Final Field";

    public void publicMethod() {
        System.out.println(publicField);
    }

    private void privateMethod() {
        System.out.println(privateField);
    }

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

        example.publicMethod();
        // example.privateMethod(); // Cannot access private method
        Example.staticMethod();
        example.finalMethod();
    }
}
