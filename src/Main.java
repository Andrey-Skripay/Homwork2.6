import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        Set<Integer> uniqueEvenNums = new TreeSet<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNums.add(num);
            }
        }
        for (int num : uniqueEvenNums) {
            System.out.println(num);
        }

        List<String> words = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana", "grape"));

        Set<String> uniqueWords = new HashSet<>(words);

        for (String word : uniqueWords) {
            System.out.println(word);
        }

        words = new ArrayList<>(List.of("one", "two", "two", "three", "three", "three"));

        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}