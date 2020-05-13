package Enum;

public enum EnumMain {
	
		KF,SF,DF;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMain[] b=EnumMain.values();
		for (EnumMain bar2 : b) {
			System.out.println(bar2);
			System.out.println(bar2.ordinal());
		}
		System.out.println(EnumMain.KF.ordinal());
	}

}
