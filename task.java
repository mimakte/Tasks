import java.util.Map;
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog. The lazy dog slept.";

        // Map to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into words using whitespace as delimiter
        String[] words = input.split("\\s+");

        // Process each word
        for (String word : words) {
            // Remove punctuation marks and convert to lowercase
            word = removePunctuation(word).toLowerCase();

            // Update word count in the map
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Display word count for each unique word
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to remove punctuation marks from a word
    private static String removePunctuation(String word) {
        StringBuilder cleanedWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                cleanedWord.append(c);
            }
        }
        return cleanedWord.toString();
    }
}

