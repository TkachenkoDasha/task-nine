package task7;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("jfb", "jfb", "fdffd"));

        for (String item : collectionWithoutDuplicate(list)) {
            System.out.println(item);
        }
    }

    private static <T> HashSet<T> collectionWithoutDuplicate(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
