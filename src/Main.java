import java.util.*;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();
        Stack<Character> st = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        Deque<Character> dq = new ArrayDeque<>();
        boolean palindrome = true;

        for(char c : input.toCharArray()){
            q.add(c);
            st.push(c);
            dq.addLast(c);
        }

        boolean palindrome = true;
        while(q.size()>0){
            if(q.poll() != st.pop()){
                palindrome = false;
                break;
            }
            while(dq.size() > 1){
                char first = dq.removeFirst();
                char second = dq.removeLast();
                if(first != second) palindrome = false;
                break;
            }
            System.out.println("Is Palindrom? :" +palindrome);

            System.out.println("Is Palindrome? :" + palindrome);
        }
    }