package DesignPattern.Facade;

public class PdfReport implements Report {

	public PdfReport() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void genrateReport(String conn,String table) {
		// TODO Auto-generated method stub
		System.out.println("PDF report genrating");
		
	}

}
