public class FileExtensionValidator {

    // Method signature requested
    public static String validateFileExtension(String filename) {
        int lastDotIndex = filename.lastIndexOf('.');

        if (lastDotIndex == -1 || lastDotIndex == filename.length() - 1) {
            return "Rejected — invalid file type";
        }

        String ext = filename.substring(lastDotIndex + 1);

        if (ext.equalsIgnoreCase("pdf") || ext.equalsIgnoreCase("docx") || ext.equalsIgnoreCase("zip")) {
            return "Accepted";
        } else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {
        // Sample tests
        System.out.println("Input: \"Assignment1.PDF\" -> Output: " + validateFileExtension("Assignment1.PDF"));
        System.out.println("Input: \"notes.txt\" -> Output: " + validateFileExtension("notes.txt"));
    }
}