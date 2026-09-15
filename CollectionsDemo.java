import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        // ArrayList demo
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Allows duplicates
        System.out.println("ArrayList: " + fruits);

        // HashSet demo
        HashSet<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Apple"); // Duplicate not added
        System.out.println("HashSet: " + uniqueFruits);

        // HashMap demo
        HashMap<String, Integer> fruitCounts = new HashMap<>();
        fruitCounts.put("Apple", 5);
        fruitCounts.put("Banana", 3);
        fruitCounts.put("Orange", 2);

        System.out.println("HashMap: " + fruitCounts);
        System.out.println("Apple count: " + fruitCounts.get("Apple"));

        // Output:
        // ArrayList: [Apple, Banana, Apple]
        // HashSet: [Apple, Banana] (Order may vary)
        // HashMap: {Apple=5, Banana=3, Orange=2} (Order may vary)
        // Apple count: 5
    }
}