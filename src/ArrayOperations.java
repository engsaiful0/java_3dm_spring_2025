import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayOperations {
    public static void main(String[] args) {

        //  Sorting Arrays
        int[] numbers = {5, 2, 9, 1, 3};
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Ascending Sort
        Arrays.sort(numbers);
        System.out.println("Sorted (Ascending): " + Arrays.toString(numbers));

        // Descending Sort (using wrapper class)
        Integer[] numbersDesc = {5, 2, 9, 1, 3};
        Arrays.sort(numbersDesc, Collections.reverseOrder());
        System.out.println("Sorted (Descending): " + Arrays.toString(numbersDesc));


        // Searching Arrays
        int searchKey = 9;
        int index = Arrays.binarySearch(numbers, searchKey);
        if (index >= 0) {
            System.out.println("Element " + searchKey + " found at index " + index);
        } else {
            System.out.println("Element " + searchKey + " not found.");
        }

        // Copying Arrays
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Partial Copy
        int[] partialCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Partial Copy (index 1 to 3): " + Arrays.toString(partialCopy));


        //Updating/Modifying Array Elements
        numbers[2] = 99; // Update element at index 2
        System.out.println("Array after modification: " + Arrays.toString(numbers));


        // Dynamic Arrays with ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Original ArrayList: " + fruits);

        // Update element
        fruits.set(1, "Blueberry");
        System.out.println("Updated ArrayList: " + fruits);

        // Remove element
        fruits.remove("Orange");
        System.out.println("ArrayList after removal: " + fruits);

        // Check existence
        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the list!");
        }

        // Sort ArrayList
        fruits.add("Cherry");
        fruits.add("Mango");
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);
    }
}
