public class PalindromeCheckerApp {

import java.util.Stack;

        public static void main(String[] args) {

            // Input string
            String input = "noon";

            // Create stack
            Stack<Character> stack = new Stack<>();

            // Push all characters into stack
            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            // Assume palindrome
            boolean isPalindrome = true;

            // Compare original with stack (reversed)
            for (char c : input.toCharArray()) {

                if (c != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Output result
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }

