public class ServerFatory implements AbstractComputer {
    private String ram;
    private String hdd;
    private String cpu;
    private String graphicEnable;
    private String bluetoothEnabled;

    public ServerFatory(String ram, String hdd, String cpu, String graphicEnable, String bluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.graphicEnable = graphicEnable;
        this.bluetoothEnabled = bluetoothEnabled;
    }

    public Computer create() {
        return new Server(ram, hdd, cpu, graphicEnable, bluetoothEnabled);
    }
}