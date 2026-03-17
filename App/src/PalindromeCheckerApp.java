public class PalindromeCheckerApp {


import java.util.*;


       import java.util.*;
    public static void main(String[] args) {

        // Input string
        String input = "refer";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters into deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst(); // from front
            char rear = deque.removeLast();   // from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}