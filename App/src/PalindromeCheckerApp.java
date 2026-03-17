public class PalindromeCheckerApp {


import java.util.LinkedList;
    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters into the list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {

            char first = list.removeFirst(); // front
            char last = list.removeLast();   // rear

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}