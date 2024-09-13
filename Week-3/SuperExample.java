// Parent class
class Animal {
    private int legs = 4;

    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Child class method
    void sound() {
        System.out.println("Dog barks");
    }

    // Method to demonstrate the use of super keyword
    void makeSound() {
        // Calling the sound method of the child class
        sound();
        
        // Calling the sound method of the parent class using super
        super.sound();
    }

    void printsLegs(){
        System.out.println(super.legs);
    }
}

// Main class to test the example
public class SuperExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Calling the makeSound method of Dog class
        dog.makeSound();

        // Printing number of legs in dog object
        dog.printsLegs();
    }
}
