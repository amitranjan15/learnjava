public class PCFactory {
    private PCFactory() {
    }

    public static Computer getObject(PCType pctype,String ram, String hdd, String cpu, String graphicEnable, String bluetoothEnabled)
    {
        switch (pctype) {
            case PC:
                return new Pc(ram, hdd, cpu, graphicEnable, bluetoothEnabled);
            case SERVER:
                return new Server(ram, hdd, cpu, graphicEnable, bluetoothEnabled);
            case LAPTOP:
                return new Laptop(ram, hdd, cpu, graphicEnable, bluetoothEnabled);
            default:
               throw new RuntimeException("invlid selection");
        }
    }
}