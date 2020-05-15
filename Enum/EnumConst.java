package Enum;

public class EnumConst {

	

	public static void main(String[] args) {
		Bar b=Bar.KF;
		Bar[] b2=Bar.values();
		for(Bar bc:b2)
		{
			bc.info();
		}
	}

}
enum Bar
{
	KF,SF{
		public void info()
		{
			System.out.println("Hello sf");
		}
	},DF;
	Bar()
	{
		System.out.println("Bar");
	}
	public void info()
	{
		System.out.println("Hello");
	}
}
