// Subtyping Example
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

public class SubtypingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound(); // Outputs: Woof
        myCat.makeSound(); // Outputs: Meow
    }
}

/*
In this example, `Dog` and `Cat` are subtypes of the `Animal` class.
Subtyping allows us to use a subclass object (like `Dog` or `Cat`) where a superclass object (`Animal`) is expected.
Here, we declare `myDog` and `myCat` as `Animal` types, but instantiate them as `Dog` and `Cat` objects, respectively.
This is useful for polymorphism where we can use the `makeSound` method on an `Animal` reference, and the actual method called will depend on the object type (`Dog` or `Cat`).
*/
