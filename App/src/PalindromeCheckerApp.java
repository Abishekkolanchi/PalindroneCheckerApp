public class PalindromeCheckerApp {


import java.util.*;


        public static void main(String[] args) {

            // Input string
            String input = "civic";

            // Create Queue (FIFO)
            Queue<Character> queue = new LinkedList<>();

            // Create Stack (LIFO)
            Stack<Character> stack = new Stack<>();

            // Insert characters into both
            for (char c : input.toCharArray()) {
                queue.add(c);   // enqueue
                stack.push(c);  // push
            }

            // Assume palindrome
            boolean isPalindrome = true;

            // Compare until queue is empty
            while (!queue.isEmpty()) {

                char fromQueue = queue.remove(); // dequeue (front)
                char fromStack = stack.pop();    // pop (top)

                if (fromQueue != fromStack) {
                    isPalindrome = false;
                    break;
                }
            }

            // Output result
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }