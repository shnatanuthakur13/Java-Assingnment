import java.util.Scanner;

public class Reversestring {

    public String reverseString(String str) {
        // Base case: If the input string is empty, return it
        if (str.isEmpty()) {
            System.out.println("Empty String");
            return str;
        } else {
            // Reverse the substring (excluding the first character) and append the first character
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc1.nextLine(); // Use nextLine to read the entire input line

        Reversestring revObj = new Reversestring();
        String newStr = revObj.reverseString(str);

        System.out.println("Reversed string: " + newStr);
        sc1.close();
    }
}
