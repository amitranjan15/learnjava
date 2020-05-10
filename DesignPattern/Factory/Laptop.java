public class Laptop implements Computer {

    private String ram;
    private String hdd;
    private String cpu;
    private String graphicEnable;
    private String bluetoothEnabled;
    private String ram() {
        return ram;
    }

    public Laptop(String ram, String hdd, String cpu, String graphicEnable, String bluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.graphicEnable = graphicEnable;
        this.bluetoothEnabled = bluetoothEnabled;
    }
    
    public String hdd() {
        return this.hdd;
    }

    public String cpu() {
        return cup;
    }

    public String graphicEnable() {
        return graphicEnable;
    }

    public String bluetoothEnabled() {
        return bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Pc [bluetoothEnabled=" + bluetoothEnabled + ", cpu=" + cpu + ", graphicEnable=" + graphicEnable
                + ", hdd=" + hdd + ", ram=" + ram + "]";
    }    
}