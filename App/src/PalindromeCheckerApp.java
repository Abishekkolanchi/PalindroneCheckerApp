public class PalindromeCheckerApp {


    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Call recursive function
        boolean result = checkPalindrome(input, 0, input.length() - 1);

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Recursive method to check palindrome
     */
    private static boolean checkPalindrome(String s, int start, int end) {

        // Base condition (stop recursion)
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call (move inward)
        return checkPalindrome(s, start + 1, end - 1);
    }
}