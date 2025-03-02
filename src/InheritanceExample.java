
public class InheritanceExample {
    public static void main(String[] args) {
        DogClass myDog = new DogClass();
        myDog.name = "Buddy";
        System.out.println("Dog Name: " + myDog.name);
        myDog.makeSound(); // Calls overridden method in Dog class
    }
}

// Parent class
class AnimalClass {
    String name;

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class inheriting from Animal
class DogClass extends AnimalClass {
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}
