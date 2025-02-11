public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Hello world"+"IIUC");
        // Primitive Data Types
        byte smallNumber = 127;         // 8-bit integer
        short shortNumber = 32000;      // 16-bit integer
        int intNumber = 2147483647;     // 32-bit integer
        long longNumber = 9223372036854775807L; // 64-bit integer

        float floatNumber = 3.14f;      // 32-bit floating point
        double doubleNumber = 3.14159265359; // 64-bit floating point

        char singleCharacter = 'A';     // 16-bit Unicode character
        boolean isJavaFun = true;       // true or false

        // Reference Data Types
        String text = "Hello, Java!";   // String (sequence of characters)
        int[] numbersArray = {1, 2, 3, 4, 5}; // Array of integers

        // Wrapper Classes (Reference Types for Primitives)
        Integer integerObject = 100;
        Double doubleObject = 10.5;
        Boolean booleanObject = Boolean.TRUE;

        // Displaying Values
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + shortNumber);
        System.out.println("Integer: " + intNumber);
        System.out.println("Long: " + longNumber);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Char: " + singleCharacter);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + text);

        System.out.print("Array: ");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Wrapper Integer: " + integerObject);
        System.out.println("Wrapper Double: " + doubleObject);
        System.out.println("Wrapper Boolean: " + booleanObject);
    }
}