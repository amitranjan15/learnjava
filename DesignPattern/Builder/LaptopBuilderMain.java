

public class LaptopBuilderMain {
    public static void main(String[] args) {
        Laptop innerLaptop= new Laptop.InnerLaptop("2GB", "120GB", "i7").build();
        Laptop innerLaptop2= new Laptop.InnerLaptop("2GB", "120GB", "i7").setBluetoothEnabled("YES").build();
        Laptop innerLaptop3= new Laptop.InnerLaptop("2GB", "120GB", "i7").setGraphicEnable("No").build();
        System.out.println(innerLaptop);
        System.out.println(innerLaptop2);
        System.out.println(innerLaptop3);
    }
}