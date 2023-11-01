import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {
    public static BigInteger calculateFactorial(int n) {
        if (n < 0) {
            return BigInteger.ZERO;
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int n = scanner.nextInt();

        scanner.close(); // Close the scanner when done with user input.

        BigInteger factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
