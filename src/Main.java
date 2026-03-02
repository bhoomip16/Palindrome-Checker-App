/**
 * ==============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==============================================================
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution performance
 * of palindrome validation algorithms.
 *
 * Features:
 * - Uses 3 palindrome checking methods
 * - Captures execution start and end time
 * - Calculates execution duration
 * - Displays benchmarking results
 *
 * Goal:
 * Introduce benchmarking concepts and algorithm comparison.
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * Accepts input from command-line arguments.
     */
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a string input.");
            return;
        }

        String input = args[0];

        System.out.println("Input: " + input);
        System.out.println("----------------------------------");

        // Method 1: Reverse String Method
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeUsingReverse(input);
        long end1 = System.nanoTime();

        // Method 2: Two Pointer Method
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeUsingLoop(input);
        long end2 = System.nanoTime();

        // Method 3: Recursive Method
        long start3 = System.nanoTime();
        boolean result3 = isPalindromeRecursive(input, 0, input.length() - 1);
        long end3 = System.nanoTime();

        // Results
        System.out.println("Method 1 (Reverse): " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Method 2 (Loop):    " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Method 3 (Recursion): " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }

    // ------------------------------------------------------
    // Method 1: Reverse String Comparison
    // ------------------------------------------------------
    public static boolean isPalindromeUsingReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // ------------------------------------------------------
    // Method 2: Loop (Two-pointer technique)
    // ------------------------------------------------------
    public static boolean isPalindromeUsingLoop(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // ------------------------------------------------------
    // Method 3: Recursive Check
    // ------------------------------------------------------
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        if (left >= right)
            return true;

        if (str.charAt(left) != str.charAt(right))
            return false;

        return isPalindromeRecursive(str, left + 1, right - 1);
    }
}