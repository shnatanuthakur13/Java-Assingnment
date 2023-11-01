import java.math.BigInteger;

public class Biginteger {
    // Method to calculate the factorial of a number using BigInteger.
    public static BigInteger calculateFactorial(int n) {
        // Check for negative input return 0 if n is negative.
        if (n < 0) {
            return BigInteger.ZERO;
        }

        // Initialize a BigInteger variable to store the result starting with 1.
        BigInteger result = BigInteger.ONE;

        // Iterate from 1 to n to calculate the factorial.
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        // Return the calculated factorial as a BigInteger.
        return result;
    }

    public static void main(String[] args) {
        // Define the number for which you want to calculate the factorial.
        int n = 100; // Change this to the desired number.

        // Call the calculateFactorial method to compute the factorial.
        BigInteger factorial = calculateFactorial(n);

        // Print the result.
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
