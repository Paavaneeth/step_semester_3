public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] charArray = text.toCharArray();
        String reversed = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed += charArray[i];
        }
        return text.equals(reversed);
    }

    public static void main(String[] args) {
        String[] testWords = {"madam", "hello"};

        for (String word : testWords) {
            boolean iterative = isPalindromeIterative(word);
            boolean recursive = isPalindromeRecursive(word);
            boolean arrayRev = isPalindromeArrayReversal(word);

            System.out.println("Input: \"" + word + "\"");
            System.out.println("Iterative: " + (iterative ? "Palindrome" : "Not Palindrome") +
                    " | Recursive: " + (recursive ? "Palindrome" : "Not Palindrome") +
                    " | Array Reversal: " + (arrayRev ? "Palindrome" : "Not Palindrome") + "\n");
        }
    }
}