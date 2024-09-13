// Deep Copy Example
class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Employee implements Cloneable {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone(); // Creates of copy of Employee
        cloned.address = new Address(this.address.getCity()); // Creates copy of Address
        return cloned;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return this.name + " " + this.address.getCity();
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");

        Employee original = new Employee("John", address);
        Employee cloned = (Employee) original.clone(); // Clone of original

        cloned.setName("Najla");

        System.out.println(original);
        System.out.println(cloned);
    }
}
