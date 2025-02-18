import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        //  One-Dimensional Array
        int[] oneDArray = {1, 2, 3, 4, 5};
        System.out.println("1D Array: " + Arrays.toString(oneDArray));

        //  Two-Dimensional Array (Matrix)
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D Array:");
        for (int[] row : twoDArray) {
            System.out.println(Arrays.toString(row));
        }

        //  Multidimensional Array (3D)
        int[][][] threeDArray = {
                {
                        {1, 2}, {3, 4}
                },
                {
                        {5, 6}, {7, 8}
                }
        };
        System.out.println("3D Array:");
        for (int[][] matrix : threeDArray) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }

        //Jagged Array (uneven column sizes)
        int[][] jaggedArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("Jagged Array:");
        for (int[] row : jaggedArray) {
            System.out.println(Arrays.toString(row));
        }

        // Array of Objects
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 22);

        System.out.println("Array of Objects:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

// Person class for array of objects
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
