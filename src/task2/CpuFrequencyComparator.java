package task2;

import java.util.Comparator;

public class CpuFrequencyComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer computer1, Computer computer2) {
        return computer1.getCpuFrequency().compareTo(computer2.getCpuFrequency());
    }
}
