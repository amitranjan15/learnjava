
public class AbstractComputerMain {
    public static void main(String[] args) {
        Computer pcf = ComputerFactory.getComputer(new LaptopFatory("11", "1120", "i7", "yes", "No"));
        Computer pcf2 = ComputerFactory.getComputer(new PCFatory( "12", "110", "i6", "No", "No"));
        Computer pcf3 = ComputerFactory.getComputer(new ServerFatory("13", "112", "i5", "Yes", "No"));
        System.out.println(pcf);
        System.out.println(pcf2);
        System.out.println(pcf3);
    }
}