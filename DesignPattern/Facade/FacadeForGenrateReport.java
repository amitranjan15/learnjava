package DesignPattern.Facade;

public class FacadeForGenrateReport {
	private Report pdf; 
	private Report html; 
	private Report docs; 
	public FacadeForGenrateReport() {
		// TODO Auto-generated constructor stub
		pdf=new PdfReport();
		html=new HtmlReport();
		docs=new DocReport();
	}
	public void pdfReportGenrate(String conn,String table)
	{
		pdf.genrateReport(conn, table); 
	}
	public void htmlReportGenrate(String conn,String table)
	{
		html.genrateReport(conn, table); 
	}
	public void docReportGenrate(String conn,String table)
	{
		docs.genrateReport(conn, table); 
	}
}
