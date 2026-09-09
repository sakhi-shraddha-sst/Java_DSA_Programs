import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class CommonElementsFinder {

    public static Integer[] findCommonElements(Integer[] arr1, Integer[] arr2) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> commonElements = new HashSet<>();

        for (Integer num : arr2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};

        Integer[] common = findCommonElements(array1, array2);
        System.out.println("Common elements: " + Arrays.toString(common));

        // Output: Common elements: [3, 4, 5]
    }
}