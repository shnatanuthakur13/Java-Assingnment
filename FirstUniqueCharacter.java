import java.util.Scanner;

public class FirstUniqueCharacter {
    public static char findFirstUniqueCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                return currentChar;
            }
        }
        return '\0'; // If no unique character is found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char firstUnique = findFirstUniqueCharacter(input);

        if (firstUnique != '\0') {
            System.out.println("The first unique character in the string is: " + firstUnique);
        } else {
            System.out.println("No unique character found in the string.");
        }

        scanner.close();
    }
}
