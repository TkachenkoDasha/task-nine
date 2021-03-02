package task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer(32, 2.2, 500, "IntelCore I5");
        Computer computer2 = new Computer(128, 2.4, 250, "IntelCore I7");
        Computer computer3 = new Computer(4, 1.7, 160, "Pentium");
        Computer computer4 = new Computer(64, 2.1, 320, "IntelCore I3");
        Computer computer5 = new Computer(2, 1.4, 120, "Celeron");

        Set<Computer> computersSet = new TreeSet<>();
        computersSet.add(computer1);
        computersSet.add(computer2);
        computersSet.add(computer3);
        computersSet.add(computer4);
        computersSet.add(computer5);

        for (Computer computer : computersSet) {
            System.out.println(computer);
        }

        System.out.println();

        Map<Computer, Integer> computersMap = new TreeMap<>();
        computersMap.put(computer1, 1);
        computersMap.put(computer2, 2);
        computersMap.put(computer3, 3);
        computersMap.put(computer4, 4);
        computersMap.put(computer5, 5);

        for (Map.Entry<Computer, Integer> item : computersMap.entrySet()) {
            System.out.println(item.getKey());
        }

        Map<Computer, Integer> mapByCpu = new TreeMap<>(new CpuNameComparator());
        mapByCpu.putAll(computersMap);

        for (Map.Entry<Computer, Integer> item : mapByCpu.entrySet()) {
            System.out.println(item.getKey());
        }
    }
}
