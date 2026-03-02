import java.util.*;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();
        int i = 0 ;
        boolean status = true;
        int j = input.length() -1;
        for(int k = 0 ; k < input.length()/2 ; k++){
            if(input.charAt(i)!= input.charAt(j)){
                status = false;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = input.length() - 1; i >= 0 ; i--){
                sb.append(input.charAt(i));
            }
            String reverse = sb.toString();

            if(input.equals(reverse)){
                System.out.println("Is Palindrome ? true "  );
            }else{
                System.out.println("Is Palindrome ? false "  );
            }



            System.out.println("Is palindrome ? " + status);

        }
    }
}