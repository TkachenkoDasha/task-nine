package task2;

import java.util.Objects;

public class Computer implements Comparable<Computer> {
    private Integer ram;
    private Double cpuFrequency;
    private Integer hddCapacityInGb;
    private String cpuName;

    public Computer(Integer ram, Double cpuFrequency, Integer hddCapacityInGb, String cpuName) {
        this.ram = ram;
        this.cpuFrequency = cpuFrequency;
        this.hddCapacityInGb = hddCapacityInGb;
        this.cpuName = cpuName;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Double getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(Double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public Integer getHddCapacityInGb() {
        return hddCapacityInGb;
    }

    public void setHddCapacityInGb(Integer hddCapacityInGb) {
        this.hddCapacityInGb = hddCapacityInGb;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "ram=" + ram +
                ", cpuFrequency=" + cpuFrequency +
                ", hddCapacityInGb=" + hddCapacityInGb +
                ", cpuName='" + cpuName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(ram, computer.ram) && Objects.equals(cpuFrequency, computer.cpuFrequency) && Objects.equals(hddCapacityInGb, computer.hddCapacityInGb) && Objects.equals(cpuName, computer.cpuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, cpuFrequency, hddCapacityInGb, cpuName);
    }

    @Override
    public int compareTo(Computer computer) {
        return this.ram.compareTo(computer.ram);
    }
}
