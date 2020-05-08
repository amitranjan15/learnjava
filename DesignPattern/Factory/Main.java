
public class Main {
    public static void main(String[] args) {
        Computer pcf = PCFactory.getObject(PCType.SERVER, "1", "120", "i7", "yes", "No");
        Computer pcf2 = PCFactory.getObject(PCType.PC, "2", "10", "i6", "No", "No");
        Computer pcf3 = PCFactory.getObject(PCType.LAPTOP, "3", "12", "i5", "Yes", "No");
        System.out.println(pcf);
        System.out.println(pcf2);
        System.out.println(pcf3);
    }
}