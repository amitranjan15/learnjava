package Enum;

public class EnumMain {
	enum bar{
		KF,SF,DF
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bar[] b=bar.values();
		for (bar bar2 : b) {
			System.out.println(bar2);
			System.out.println(bar2.ordinal());
		}
		System.out.println(bar.KF.ordinal());
	}

}
