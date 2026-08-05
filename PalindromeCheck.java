public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";

        // If the string contains uppercase and lowercase letters,
        // convert it to lower or upper case before checking.
        // Example:
        // str = str.toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(str + " is palindrome: " + isPalindrome);
    }
}