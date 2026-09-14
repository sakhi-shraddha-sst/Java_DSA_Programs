import java.util.*;

public class CollectionConverter {

    public static void main(String[] args) {

        // Create List with duplicates
        List<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Alice"); // Duplicate
        namesList.add("Charlie");

        System.out.println("Original List: " + namesList);

        // Convert List to Set (removes duplicates)
        Set<String> namesSet = new HashSet<>(namesList);
        System.out.println("After List to Set conversion: " + namesSet);

        // Convert Set back to List
        List<String> uniqueNamesList = new ArrayList<>(namesSet);
        System.out.println("After Set to List conversion: " + uniqueNamesList);

        // Output:
        // Original List: [Alice, Bob, Alice, Charlie]
        // After List to Set conversion: [Alice, Bob, Charlie]
        // After Set to List conversion: [Alice, Bob, Charlie]
        // (Order may vary because HashSet doesn't maintain insertion order)
    }
}