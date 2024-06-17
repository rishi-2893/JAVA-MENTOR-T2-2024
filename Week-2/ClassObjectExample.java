// Defining a Class and Creating Object
class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ClassObjectExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 30;
        person.display();
    }
}
