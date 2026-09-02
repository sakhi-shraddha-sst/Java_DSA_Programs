import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find first character with count 1
        for (char c : str.toCharArray()) {
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        // If no non-repeated character found
        return '\0';
    }

    public static void main(String[] args) {
        String str = "programming";
        char result = findFirstNonRepeatedChar(str);

        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
            // Output: First non-repeated character: p
        } else {
            System.out.println("No non-repeated character found");
            // Output: No non-repeated character found
        }
    }
}