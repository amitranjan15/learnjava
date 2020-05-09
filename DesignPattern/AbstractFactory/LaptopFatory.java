public class LaptopFatory implements AbstractComputer {
    private String ram;
    private String hdd;
    private String cpu;
    private String graphicEnable;
    private String bluetoothEnabled;

    public LaptopFatory(String ram, String hdd, String cpu, String graphicEnable, String bluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.graphicEnable = graphicEnable;
        this.bluetoothEnabled = bluetoothEnabled;
        System.out.println("Laptop");
    }

    public Computer create() {
        return new Laptop(ram, hdd, cpu, graphicEnable, bluetoothEnabled);
    }
}