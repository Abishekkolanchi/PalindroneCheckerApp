public class PalindromeCheckerApp {




     {

        public static void main(String[] args) {

            // Input string
            String input = "racecar";

            // Create object of service class
            PalindromeService service = new PalindromeService();

            // Call method
            boolean result = service.checkPalindrome(input);

            // Output
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + result);
        }
    }


    class PalindromeService {

        // Method to check palindrome
        public boolean checkPalindrome(String input) {

            int start = 0;
            int end = input.length() - 1;

            // Two-pointer logic
            while (start < end) {

                if (input.charAt(start) != input.charAt(end)) {
                    return false;
                }

                start++;
                end--;
            }

            return true;
        }
    }