

public class Laptop {
    private String ram;
    private String hdd;
    private String cpu;
    private String graphicEnable;
    private String bluetoothEnabled;

    private String ram() {
        return ram;
    }

    private Laptop(InnerLaptop laptop) {
        this.ram = laptop.ram;
        this.hdd = laptop.hdd;
        this.cpu = laptop.cpu;
        this.graphicEnable = laptop.graphicEnable;
        this.bluetoothEnabled = laptop.bluetoothEnabled;
    }

    String hdd() {
        return this.hdd;
    }

    String cpu() {
        return this.cup;
    }

    String graphicEnable() {
        return this.graphicEnable;
    }

    String bluetoothEnabled() {
        return this.bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Pc [bluetoothEnabled=" + bluetoothEnabled + ", cpu=" + cpu + ", graphicEnable=" + graphicEnable
                + ", hdd=" + hdd + ", ram=" + ram + "]";
    }

    /**
     * InnerLaptop
     */
    public static class InnerLaptop {
        private String ram;
        private String hdd;
        private String cpu;
        private String graphicEnable;
        private String bluetoothEnabled;

        public InnerLaptop(String ram, String hdd, String cpu) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        public InnerLaptop setGraphicEnable(String graphicEnable) {
            this.graphicEnable = graphicEnable;
            return this;
        }

        public InnerLaptop setBluetoothEnabled(String bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}