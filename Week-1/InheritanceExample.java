// Inheritance Example
class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started");
    }
    
    void honk() {
        System.out.println("Car horn honking");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine(); // Outputs: Car engine started
        myCar.honk(); // Outputs: Car horn honking
    }
}

/*
In this example, `Vehicle` is the superclass, and `Car` is the subclass.
The `Car` class inherits from the `Vehicle` class, meaning it can use the methods defined in `Vehicle`.
The `Car` class overrides the `startEngine` method to provide a more specific implementation.
Additionally, `Car` has its own method `honk` which is not present in the `Vehicle` class.
In the `main` method, we create an instance of `Car` and call its methods.
The `startEngine` method demonstrates how the `Car` class can override the behavior of the `Vehicle` class.
Inheritance allows the `Car` class to reuse and extend the functionality of the `Vehicle` class.
*/
