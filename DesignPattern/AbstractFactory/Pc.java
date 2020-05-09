public class Pc implements Computer {

    private String ram;
    private String hdd;
    private String cpu;
    private String graphicEnable;
    private String bluetoothEnabled;
    private String ram() {
        return ram;
    }

    public Pc(String ram, String hdd, String cpu, String graphicEnable, String bluetoothEnabled) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.graphicEnable = graphicEnable;
        this.bluetoothEnabled = bluetoothEnabled;
    }
    String hdd() {
      return  this.hdd;
    }

    String cpu() {
        return cup;
    }

    String graphicEnable() {
        return graphicEnable;
    }

    String bluetoothEnabled() {
        return bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Pc [bluetoothEnabled=" + bluetoothEnabled + ", cpu=" + cpu + ", graphicEnable=" + graphicEnable
                + ", hdd=" + hdd + ", ram=" + ram + "]";
    }

    
    
}