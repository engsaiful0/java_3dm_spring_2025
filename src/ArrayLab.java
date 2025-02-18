import java.util.Scanner;
import java.util.Arrays;

public class ArrayLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Input array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        //  Declare & Input array elements
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        //  Calculate sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / size;

        //  Find max and min
        int max = numbers[0], min = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        //  Sort the array
        Arrays.sort(numbers);

        // ⃣Display results
        System.out.println("\n Results:");
        System.out.println(" Array Elements: " + Arrays.toString(numbers));
        System.out.println(" Sum: " + sum);
        System.out.println(" Average: " + average);
        System.out.println(" Maximum: " + max);
        System.out.println(" Minimum: " + min);
        System.out.println(" Sorted Array: " + Arrays.toString(numbers));

        scanner.close();
    }
}
