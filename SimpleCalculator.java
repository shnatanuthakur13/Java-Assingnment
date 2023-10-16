import java.util.Scanner;
//Shantanu Tahkur
//Urn no: 2022-M-13041999

public class SimpleCalculator {

    // Static method for addition
    static int add(int number1, int number2) {
        return number1 + number2;
    }

    // Static method for subtraction
    static int sub(int number1, int number2) {
        if (number2 > number1) {
            System.out.println("Cannot subtract " + number2 + " from " + number1);
            return 0; // Return a default value, or you can choose to throw an exception.
        }
        return number1 - number2;
    }

    // Static method for multiplication
    static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    // Static method for division
    static int division(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Cannot divide by 0");
            return 0; // Return a default value, or you can choose to throw an exception.
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        String operation;
        int firstNumber;
        int secondNumber;
        String again;

        do {
            // Prompt the user to enter an operation
            System.out.println("Enter an operation (+, -, *, /) : ");
            operation = scanner.next();

            // Prompt the user to enter the first number
            System.out.println("Enter the first number: ");
            firstNumber = scanner.nextInt();

            // Prompt the user to enter the second number
            System.out.println("Enter the second number: ");
            secondNumber = scanner.nextInt();

            // Use a switch statement to determine which operation to perform
            switch (operation.trim()) {
                case "+":
                    result = add(firstNumber, secondNumber);
                    break;
                case "-":
                    result = sub(firstNumber, secondNumber);
                    break;
                case "*":
                    result = multiply(firstNumber, secondNumber);
                    break;
                case "/":
                    result = division(firstNumber, secondNumber);
                    break;
                default:
                    // Inform the user of an invalid operation
                    System.out.println("Invalid operation");
                    break;
            }

            // Display the result of the calculation
            String showResult = String.format("Result is : %d %s %d = %d",
                    firstNumber, operation, secondNumber, result);
            System.out.println(showResult);

            // Ask the user if they want to perform another calculation
            System.out.println("Would you like to perform another calculation? (y/n)");
            again = scanner.next();

        } while (again.equals("y"));

        scanner.close();
    }
}
