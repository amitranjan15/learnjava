package DesignPattern.Adapter;

public class MobileAdapterImp implements MobileAdapter {

	private WallAdapter adapter;
	public MobileAdapterImp(WallAdapter adapter) {
		// TODO Auto-generated constructor stub
		this.adapter=adapter;
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		int volt3=adapter.get240Volt().getVolt()/80;
		return new Volt(volt3);
	}

}
