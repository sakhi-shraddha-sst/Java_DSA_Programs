public class WhiteSpaceRemover {

    // Method 1: Using replaceAll() with Regular Expression
    public static String removeWhiteSpacesRegex(String input) {
        return input.replaceAll("\\s+", "");
    }

    // Method 2: Manual approach using StringBuilder
    public static String removeWhiteSpacesManual(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String text = " Java  Programming is  fun ";

        System.out.println("Original string: \"" + text + "\"");
        System.out.println("After removing spaces (Regex): \"" +
                removeWhiteSpacesRegex(text) + "\"");
        System.out.println("After removing spaces (Manual): \"" +
                removeWhiteSpacesManual(text) + "\"");
        System.out.println("Using String replace(): " + text.replace(" ", ""));

        // Output:
        // Original string: " Java  Programming is  fun "
        // After removing spaces (Regex): "JavaProgrammingisfun"
        // After removing spaces (Manual): "JavaProgrammingisfun"
        // Using String replace(): JavaProgrammingisfun
    }
}