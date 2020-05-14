package Enum;

public class EnumConst {

	

	public static void main(String[] args) {
		Bar b=Bar.KF;
	}

}
enum Bar
{
	KF,SF,DF;
	Bar()
	{
		System.out.println("Bar");
	}
}
