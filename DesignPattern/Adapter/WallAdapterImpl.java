package DesignPattern.Adapter;

public class WallAdapterImpl implements WallAdapter {

	private int volt;
	public WallAdapterImpl() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public Volt get240Volt() {
		// TODO Auto-generated method stub
		return new Volt(240);
	}

}
