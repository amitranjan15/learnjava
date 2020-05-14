package DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class ServiceProvider implements Service {

	public ServiceProvider() {
		// TODO Auto-generated constructor stub
		serviceList=new ArrayList<>();
	}
	
	List<Service> serviceList;

	@Override
	public void service(String service) {
		serviceList.forEach(p->{
			p.service(service);
		});
		
	}
	
	public void add(Service service)
	{
		serviceList.add(service);
	}
	public void add(List<Service> service)
	{
		serviceList.addAll(service);
	}
	public void removeAll() {
		serviceList.clear();
	}
}
