import java.util.*;

public class PalindromeCheckerApp {

    static boolean palidrome(String s , int start , int end){
        if(start >= end) return  true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return palidrome(s,start+1,end -1);
        public static boolean isPalindrome(String input) {

            String normalized = input.toLowerCase().replaceAll("\\s+", "");

            char[] charArray = normalized.toCharArray();

            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {
                if (charArray[left] != charArray[right]) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input text : ");
            String input = sc.nextLine();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            System.out.println("Is Palindrom? :"+ isPalindrome(input));

            System.out.println("Is Palindrom? :"+ palidrome(input,0,input.length()-1));

            sc.close();
            scanner.close();
        }
    }