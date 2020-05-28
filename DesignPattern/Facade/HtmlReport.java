package DesignPattern.Facade;

public class HtmlReport implements Report {

	public HtmlReport() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void genrateReport(String conn,String table) {
		// TODO Auto-generated method stub
		System.out.println("HTML report genrating");
		
	}

}
