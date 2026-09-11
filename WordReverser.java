public class WordReverser {

    public static String reverseWords(String sentence) {

        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        // Add words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);

            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String sentence = "Java is a programming language";

        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reverseWords(sentence));

        // Output:
        // Original: Java is a programming language
        // Reversed: language programming a is Java
    }
}