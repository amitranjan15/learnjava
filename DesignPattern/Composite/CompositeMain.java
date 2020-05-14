package DesignPattern.Composite;

public class CompositeMain {

	public CompositeMain() {
		
	}
	public static void main(String[] args) {
		Service service=new EmpServiceImpl();
		Service service2=new EmpServiceImpl();
		Service service3=new EmpServiceImpl();
		
		Service serviceAdmin=new AdminServiceEmp();
		Service serviceAdmin2=new AdminServiceEmp();
		Service serviceAdmin3=new AdminServiceEmp();
		
		ServiceProvider provider=new ServiceProvider();
		provider.add(service);
		provider.add(serviceAdmin);
		provider.add(service2);
		provider.add(serviceAdmin2);
		provider.add(service3);
		provider.add(serviceAdmin3);
		
		provider.service("Register service");
	}
}
