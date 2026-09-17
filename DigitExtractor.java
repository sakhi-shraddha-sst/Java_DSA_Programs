public class DigitExtractor {

    // Method 1: Using regular expressions
    public static String extractDigitsRegex(String input) {
        return input.replaceAll("[^0-9]", "");
    }

    // Method 2: Using Character.isDigit()
    public static String extractDigitsManual(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String alphanumeric = "abc123def456ghi789";

        System.out.println("Original string: " + alphanumeric);
        System.out.println("Extracted digits (regex): "
                + extractDigitsRegex(alphanumeric));
        System.out.println("Extracted digits (manual): "
                + extractDigitsManual(alphanumeric));

        // Output:
        // Original string: abc123def456ghi789
        // Extracted digits (regex): 123456789
        // Extracted digits (manual): 123456789
    }
}