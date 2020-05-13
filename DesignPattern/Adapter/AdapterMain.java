package DesignPattern.Adapter;

public class AdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WallAdapter wa=new WallAdapterImpl();
		Volt v=wa.get240Volt();
		System.out.println(v.getVolt());
		
		MobileAdapter ma=new MobileAdapterImp(wa);
		Volt v2=ma.get3Volt();
		System.out.println(v2.getVolt());
	}

}
