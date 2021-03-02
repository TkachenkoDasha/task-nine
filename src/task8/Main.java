package task8;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "1";
        strings[1] = "3";
        strings[2] = "1";
        strings[3] = "3";
        strings[4] = "6";

        for (Map.Entry<String, Integer> entry : arrayToMap(strings).entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }

    }

    private static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> result = new HashMap<>();

        for (K element : ks) {
            if (result.containsKey(element)) {
                Integer currentCount = result.get(element);
                result.put(element, ++currentCount);
            } else {
                result.put(element, 1);
            }
        }

        return result;
    }
}
