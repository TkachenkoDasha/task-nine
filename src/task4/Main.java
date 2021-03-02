package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String someString = "Кукуруза";

        System.out.print("{ ");
        for (Map.Entry<Character, Integer> entry : numberOfOccurrences(someString).entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
        System.out.print(" }");

    }

    private static Map<Character, Integer> numberOfOccurrences(String line) {
        line = line.toLowerCase();
        Map<Character, Integer> mapOfOccurrences = new LinkedHashMap<>();

        for (int i = 0; i < line.length(); i++) {
            Character letter = line.charAt(i);

            if (mapOfOccurrences.containsKey(letter)) {
                Integer currentCount = mapOfOccurrences.get(letter);
                mapOfOccurrences.put(letter, ++currentCount);
            } else {
                mapOfOccurrences.put(letter, 1);
            }
        }

        return mapOfOccurrences;
    }
}
