package task2;

import java.util.Comparator;

public class CpuNameComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer cpuName1, Computer cpuName2) {
        return cpuName1.getCpuName().compareTo(cpuName2.getCpuName());
    }
}
