// Grandparent Class
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
