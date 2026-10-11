public class VowelConsonantCounters {

    // Method signature requested
    public static void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);

            // Check if it's an alphabetical letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Input: \"" + text + "\"");
        System.out.println("Output: Vowels: " + vowels + " | Consonants: " + consonants);
    }

    public static void main(String[] args) {
        // Sample test
        countVowelsAndConsonants("Java Programming");
    }
}