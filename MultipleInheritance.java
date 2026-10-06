AIM

To write a Java program to demonstrate Multiple Inheritance using interfaces, where a class implements two interfaces.

ALGORITHM
Start the program.
Create an interface Father with the method showFather().
Create another interface Mother with the method showMother().
Create a class Child that implements both Father and Mother.
Define the methods showFather() and showMother() inside the Child class.
Create an object c of the Child class.
Call showFather() and showMother() using the object.
Display the details of both methods.
    interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {

    public void showFather() {
        System.out.println("Father: Engineer");
    }

    public void showMother() {
        System.out.println("Mother: Teacher");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}
OUTPUT
Father: Engineer
Mother: Teacher
RESULT

Thus, the Java program to demonstrate multiple inheritance using interfaces was executed successfully and the desired output was obtained.
