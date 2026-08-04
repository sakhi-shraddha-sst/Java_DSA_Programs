public class StringReversal {
    public static void main(String[] args) {
        String original = "automation";

        // Using StringBuilder
        String reversed = new StringBuilder(original)
                .reverse()
                .toString();

        System.out.println("Reversed: " + reversed);
    }
}