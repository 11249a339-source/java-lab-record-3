AIM

To write a Java program to demonstrate Single Inheritance, where a child class inherits the properties and methods of a single parent class.

ALGORITHM
Start the program.
Create a parent class Animal with the method eat().
Create a child class Dog that extends the Animal class.
Define the bark() method inside the Dog class.
Create an object d of the Dog class.
Call the inherited eat() method using the Dog object.
Call the bark() method using the same object.
Display the results.
Stop the program.
    class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
OUTPUT
Animal is eating
Dog is barking
RESULT

Thus, the Java program to demonstrate single inheritance was executed successfully and the desired output was obtained.
