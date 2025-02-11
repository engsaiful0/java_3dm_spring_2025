import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a byte: ");
        byte byteValue = sc.nextByte();

        System.out.print("Enter a short: ");
        short shortValue = sc.nextShort();

        System.out.print("Enter a long: ");
        long longValue = sc.nextLong();

        System.out.print("Enter a float: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double: ");
        double doubleValue = sc.nextDouble();

        System.out.print("Enter a boolean: ");
        boolean boolValue = sc.nextBoolean();

        System.out.print("Enter a word: ");
        String word = sc.next();

        sc.nextLine();  // Consume the newline left by next()

        System.out.print("Enter a full line: ");
        String line = sc.nextLine();

        System.out.print("Enter a big integer: ");
        BigInteger bigIntValue = sc.nextBigInteger();

        System.out.print("Enter a big decimal: ");
        BigDecimal bigDecimalValue = sc.nextBigDecimal();

        System.out.println("\nCollected Data:");
        System.out.println("Integer: " + intValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("Word: " + word);
        System.out.println("Line: " + line);
        System.out.println("Big Integer: " + bigIntValue);
        System.out.println("Big Decimal: " + bigDecimalValue);

        sc.close();
    }
}
