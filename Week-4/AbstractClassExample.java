// Abstract Classes Example
abstract class Animal {
    // Abstract method - You haven't implemented the method
    abstract void makeSound();

    // Concrete method - You have provided the implementation
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    // Dog class provides an concrete implementation of the 
    // ABSTRACT method makeSound()
    void makeSound() {
        System.out.println("Woof");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Outputs: Woof
        dog.sleep(); // Outputs: Animal is sleeping
    }
}
