import java.util.*;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeCheckerApp {

    static Node createList(String str) {
        Node head = null, tail = null;

        for (char ch : str.toCharArray()) {
            Node newNode = new Node(ch);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();
        Deque<Character> dq = new ArrayDeque<>();
        boolean palindrome = true;

        for(char c : input.toCharArray()){
            dq.addLast(c);
        }
        while(dq.size() > 1){
            char first = dq.removeFirst();
            char second = dq.removeLast();
            if(first != second) palindrome = false;
            break;
        }
        System.out.println("Is Palindrome? :" + palindrome);
    }
}
Node head = createList(input);
        System.out.println("Is Palindrom? :"+isPalindrome(head));

        sc.close();
    }
            }