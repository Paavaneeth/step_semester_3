package assigment_problems;

public class TypingAccuracyChecker {
    public static void checkTypingAccuracy(String original, String typed) {
        int length = original.length();
        int matched = 0;
        int firstMismatchPos = -1;
        char origChar = ' ';
        char typedChar = ' ';

        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else {
                if (firstMismatchPos == -1) {
                    firstMismatchPos = i + 1; // 1-based position
                    origChar = original.charAt(i);
                    typedChar = typed.charAt(i);
                }
            }
        }

        double accuracy = ((double) matched / length) * 100;

        if (firstMismatchPos == -1) {
            System.out.println("Matched: " + matched + "/" + length + " | Accuracy: " + String.format("%.2f", accuracy) + "% | No Mismatches");
        } else {
            System.out.println("Matched: " + matched + "/" + length + " | Accuracy: " + String.format("%.2f", accuracy) + "% | First Mismatch at position " + firstMismatchPos + " ('" + origChar + "' vs '" + typedChar + "')");
        }
    }
}