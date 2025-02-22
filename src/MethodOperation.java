// Abstract class with an abstract method
abstract class Animal {
    abstract void makeSound();
}

// Subclass overriding the abstract method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

// Class demonstrating method overloading, static, instance, and final methods
class Operations {

    // Static method (does not need an object)
    public static void staticMethod() {
        System.out.println("Static Method Called");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance Method Called");
    }

    // Method Overloading (Same name, different parameters)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Final method (Cannot be overridden)
    public final void finalMethod() {
        System.out.println("Final Method Called");
    }

    // Synchronized method (Thread-safe)
    public synchronized void synchronizedMethod() {
        System.out.println("Synchronized Method Called");
    }
}

// Functional interface for Lambda expression
interface Greeting {
    void sayHello();
}

public class MethodOperation {
    public static void main(String[] args) {
        // Calling static method
        Operations.staticMethod();

        // Creating an instance to call instance methods
        Operations obj = new Operations();
        obj.instanceMethod();

        // Method Overloading demonstration
        System.out.println("Addition (int): " + obj.add(5, 10));
        System.out.println("Addition (double): " + obj.add(5.5, 2.5));

        // Final method call
        obj.finalMethod();

        // Creating an object of Dog class (Method Overriding)
        Animal myDog = new Dog();
        myDog.makeSound();

        // Lambda expression
        Greeting greet = () -> System.out.println("Hello, Lambda!");
        greet.sayHello();
    }
}
