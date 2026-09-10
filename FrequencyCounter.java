import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

    public static Map<String, Integer> countFrequency(String[] array) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : array) {
            // If key exists, increment count; otherwise, set count to 1
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String[] fruits = {
                "Apple", "Banana", "Apple", "Orange", "Banana",
                "Orange", "Orange", "Apple", "Orange", "Grape"
        };

        Map<String, Integer> frequency = countFrequency(fruits);

        System.out.println("Frequency of elements:");
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Output:
        // Frequency of elements:
        // Apple: 3
        // Banana: 2
        // Orange: 4
        // Grape: 1
        // (Order may vary because HashMap doesn't maintain insertion order)
    }
}