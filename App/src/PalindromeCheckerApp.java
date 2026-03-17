public class PalindromeCheckerApp {




import java.util.*;

    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String input = "level";

            // -------- Method 1: Two Pointer --------
            long start1 = System.nanoTime();
            boolean result1 = checkTwoPointer(input);
            long end1 = System.nanoTime();

            // -------- Method 2: Stack --------
            long start2 = System.nanoTime();
            boolean result2 = checkStack(input);
            long end2 = System.nanoTime();

            // -------- Method 3: Reverse String --------
            long start3 = System.nanoTime();
            boolean result3 = checkReverse(input);
            long end3 = System.nanoTime();

            // Output results
            System.out.println("Input : " + input);
            System.out.println("\nTwo Pointer Result : " + result1 +
                    " | Time: " + (end1 - start1) + " ns");

            System.out.println("Stack Result       : " + result2 +
                    " | Time: " + (end2 - start2) + " ns");

            System.out.println("Reverse Result     : " + result3 +
                    " | Time: " + (end3 - start3) + " ns");
        }

        // Two Pointer Method (UC4)
        public static boolean checkTwoPointer(String s) {
            int start = 0, end = s.length() - 1;

            while (start < end) {
                if (s.charAt(start) != s.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

        // Stack Method (UC5)
        public static boolean checkStack(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                stack.push(c);
            }

            for (char c : s.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }
            return true;
        }

        // Reverse Method (UC3)
        public static boolean checkReverse(String s) {
            String reversed = "";

            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }

            return s.equals(reversed);
        }
    }