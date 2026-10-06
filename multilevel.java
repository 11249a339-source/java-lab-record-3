AIM

To write a Java program to demonstrate Multilevel Inheritance, where a class inherits from another derived class in multiple levels.

ALGORITHM
Start the program.
Create a parent class Vehicle with the method startEngine().
Create a class Car that extends Vehicle and define the method drive().
Create a class ElectricCar that extends Car and define the method chargeBattery().
Create an object myTesla of the ElectricCar class.
Call startEngine() inherited from Vehicle.
Call drive() inherited from Car.
Call chargeBattery() defined in ElectricCar.
Display all the results.
Stop the program.
class Vehicle {
    void startEngine() {
        System.out.println("Engine started. Vehicle ready.");
    }
}

// Parent Class inherits Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Driving on four wheels.");
    }
}

// Child Class inherits Car (Inherits everything from Car and Vehicle)
class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Battery charging... 100%");
    }
}

// Execution Entry Point
public class multilevel {
    public static void main(String[] args) {
        // Instantiate the leaf/child class
        ElectricCar myTesla = new ElectricCar();
        
        myTesla.startEngine();  // Inherited from Grandparent (Vehicle)
        myTesla.drive();        // Inherited from Parent (Car)
        myTesla.chargeBattery(); // Native to Child (ElectricCar)
    }
}
OUTPUT
Engine started. Vehicle ready.
Driving on four wheels.
Battery charging... 100%
RESULT
Thus, the Java program to demonstrate multilevel inheritance was executed successfully and the desired output was obtained.
