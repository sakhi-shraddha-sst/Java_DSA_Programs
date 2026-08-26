public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {

        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert to char arrays and sort
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Compare sorted arrays
        return java.util.Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams: "
                + areAnagrams(s1, s2));
        // Output: "Listen" and "Silent" are anagrams: true
    }
}