package task6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> setOfLines = new HashSet<>();
        setOfLines.add("fkjhsjdkf");
        setOfLines.add("slkjhdkjsk");
        setOfLines.add("poiuytretyuio");
        setOfLines.add("kjhgfghjk");
        setOfLines.add("kjhkjdls");

        System.out.println("First method for HashSet");
        for (String lines : setOfLines) {
            System.out.println(lines);
        }
        System.out.println();

        System.out.println("Second method HashSet");
        Iterator<String> iter = setOfLines.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println();

        System.out.println("Third method HashSet");
        setOfLines.forEach(System.out::println);
        System.out.println();

        System.out.println("Fourth method for HashSet");
        setOfLines.forEach(line -> System.out.println((line)));
        System.out.println();

        Map<Integer, String> mapOfLines = new HashMap<>();
        mapOfLines.put(1, "fkjhsjdkf");
        mapOfLines.put(2, "slkjhdkjsk");
        mapOfLines.put(3, "poiuytretyuio");
        mapOfLines.put(4, "kjhgfghjk");
        mapOfLines.put(5, "kjhkjdls");

        System.out.println("First method for HashMap");
        for (Map.Entry<Integer,String> entry : mapOfLines.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();

        System.out.println("Second method for HashMap");
        Iterator<Map.Entry<Integer, String>> iterator = mapOfLines.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();

        System.out.println("Third method for HashMap");
        mapOfLines.forEach((k, v) -> System.out.println((k + ":" + v)));
        System.out.println();

        System.out.println("Fourth method for HashMap");
        mapOfLines.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
        System.out.println();
    }
}
