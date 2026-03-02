import java.util.*;
public class PalindromeCheckerApp {
    /*
    Application entry Point

    This is the first method executed by the JVM
    when the program starts
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
        }

    @author Developer
    @version 1.0
     */
        System.out.println("Is palindrome ? " + status);

    public static  void main(String []args){
        System.out.println("Welcome to the Palindrom Checker");
        System.out.println("Version 1.0");
        System.out.println("System initialised succesfully");
    }
}