import java.util.Scanner;
import java.util.Stack;

// Class responsible only for palindrome logic (Single Responsibility Principle)
class PalindromeChecker {

    // Method to check palindrome using Stack (encapsulation)
    public boolean checkPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        // Compare with reversed order from stack
        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Main application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("Palindrome Checker App");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}