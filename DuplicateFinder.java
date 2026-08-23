import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFinder {

    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            if (!seen.add(num)) { // add() returns false if element already exists
                duplicates.add(num);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        System.out.println("Duplicate elements: " + findDuplicates(numbers));
        // Output: Duplicate elements: [2, 8, 3]
    }
}