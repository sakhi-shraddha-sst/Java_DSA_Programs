public class MissingNumberFinder {

    public static int findMissingNumber(int[] arr, int n) {

        // Expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate actual sum of array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // Missing number is the difference
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 3, 7, 8};
        int n = 8; // Range is 1 to 8

        System.out.println("Missing number: " + findMissingNumber(numbers, n));
        // Output: Missing number: 5
    }
}