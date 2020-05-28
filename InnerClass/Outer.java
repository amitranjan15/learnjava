package InnerClass;

public class Outer {
	
	class Inner{
		public void m1()
		{
			System.out.println("Inner");
		}
	}
	
	public void m2()
	{
		Inner inner=new Inner();
		inner.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer  o=new Outer();
		o.m2();
		Outer.Inner in=o.new Inner();
		in.m1();
		Outer.Inner oin=new Outer().new Inner();
		oin.m1();
	}

}
