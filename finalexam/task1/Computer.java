package finalexam.task1;

public class Computer {
    private String brand;
    private int memory;
    private int ssd;
    private int hdd;

    public Computer(String brand, int memory, int ssd, int hdd) {
        this.brand = brand;
        this.memory = memory;
        this.ssd = ssd;
        this.hdd = hdd;
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", memory=" + memory + "GB" +
                ", ssd=" + ssd + "GB" +
                ", hdd=" + hdd + "GB" +
                '}';
    }
}