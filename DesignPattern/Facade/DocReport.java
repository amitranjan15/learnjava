package DesignPattern.Facade;

public class DocReport implements Report {

	public DocReport() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void genrateReport(String conn,String table) {
		// TODO Auto-generated method stub
		System.out.println("Docs report genrating");
		
	}

}
