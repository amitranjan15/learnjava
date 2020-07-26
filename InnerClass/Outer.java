package InnerClass;

public class Outer {
	private int x=10;
	static int y=20;
	class Inner{
		int x=100;
		public void m1()
		{
			int x=1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer.this.x);
			System.out.println(y);
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
