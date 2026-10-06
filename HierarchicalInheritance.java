AIM

To write a Java program to demonstrate Hierarchical Inheritance, where multiple child classes inherit properties and methods from a single parent class.

ALGORITHM
Start the program.
Create a parent class Animal with the method eat().
Create a child class Dog that extends Animal and define the method bark().
Create another child class Cat that extends Animal and define the method meow().
Create objects d for Dog and c for Cat.
Using the Dog object, call eat() and bark().
Using the Cat object, call eat() and meow().
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

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Dog:");
        d.eat();
        d.bark();

        System.out.println("Cat:");
        c.eat();
        c.meow();
    }
}
OUTPUT
Dog:
Animal is eating
Dog is barking
Cat:
Animal is eating
Cat is meowing
RESULT

Thus, the Java program to demonstrate hierarchical inheritance was executed successfully and the desired output was obtained.
