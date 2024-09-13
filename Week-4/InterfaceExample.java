interface Animal {
    void makeSound();
}

interface Living1{
    void func();
}
interface Living2{
    void func();
}


class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
    public void func(){
        System.out.println("Anything");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}