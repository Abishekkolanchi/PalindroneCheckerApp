public class PalindromeCheckerApp {



import java.util.*;


    interface PalindromeStrategy {
        boolean check(String input);
    }


    class StackStrategy implements PalindromeStrategy {

        public boolean check(String input) {

            Stack<Character> stack = new Stack<>();

            // Push characters
            for (char c : input.toCharArray()) {
                stack.push(c);
            }

            // Compare with pop
            for (char c : input.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    // Deque-based Strategy
    class DequeStrategy implements PalindromeStrategy {

        public boolean check(String input) {

            Deque<Character> deque = new ArrayDeque<>();

            // Add characters
            for (char c : input.toCharArray()) {
                deque.add(c);
            }

            // Compare front & rear
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    // Context Class
    class PalindromeContext {

        private PalindromeStrategy strategy;

        // Set strategy at runtime
        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String input) {
            return strategy.check(input);
        }
    }

    // Main Class
    public class PalindromeCheckerApp {

        public static void main(String[] args) {

            String input = "level";

            PalindromeContext context = new PalindromeContext();

            // Choose strategy dynamically
            context.setStrategy(new StackStrategy());   // try DequeStrategy()

            boolean result = context.execute(input);

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + result);
        }
    }