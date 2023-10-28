import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a binary number
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        
        // Call the binaryToDecimal function to perform the conversion
        int decimal = binaryToDecimal(binaryString);
        
        // Check if an error occurred during the conversion
        if (decimal == -1) {
            System.out.println("Invalid binary input.");
        } else {
            // Display the decimal equivalent
            System.out.println("Decimal equivalent: " + decimal);
        }
    }

    public static int binaryToDecimal(String binaryString) {
        // Initialize the decimal equivalent to 0
        int decimal = 0;
        
        // Get the length of the binary string
        int binaryLength = binaryString.length();

        // Iterate through each digit in the binary string
        for (int i = 0; i < binaryLength; i++) {
            // Get the digit at the current position
            char digit = binaryString.charAt(i);
            
            // Calculate the power based on the position
            int power = binaryLength - i - 1;
            
            // Convert the character digit to an integer value
            int intValue = Character.getNumericValue(digit);

            // Check if the input is a valid binary digit (0 or 1)
            if (intValue != 0 && intValue != 1) {
                return -1; // Return -1 to indicate an error
            }

            // Calculate the contribution of the current digit to the decimal value
            decimal += intValue * Math.pow(2, power);
        }

        // Return the final decimal equivalent
        return decimal;
    }
}
