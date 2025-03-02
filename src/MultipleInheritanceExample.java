// First interface
interface Engine {
    void startEngine();
}

// Second interface
interface Wheels {
    void rotateWheels();
}

// Class implementing both interfaces
class CarClass implements Engine, Wheels {
    public void startEngine() {
        System.out.println("Engine is starting...");
    }

    public void rotateWheels() {
        System.out.println("Wheels are rotating...");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        CarClass myCar = new CarClass();
        myCar.startEngine();   // Calls method from Engine interface
        myCar.rotateWheels();  // Calls method from Wheels interface
    }
}
