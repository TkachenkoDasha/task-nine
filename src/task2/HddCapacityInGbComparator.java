package task2;

import java.util.Comparator;

public class HddCapacityInGbComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer computer1, Computer computer2) {
        return computer1.getHddCapacityInGb().compareTo(computer2.getHddCapacityInGb());
    }
}
