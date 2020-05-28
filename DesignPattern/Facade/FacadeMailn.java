package DesignPattern.Facade;

public class FacadeMailn {
	public static void main(String[] args) {
		FacadeForGenrateReport fg=new FacadeForGenrateReport();
		fg.pdfReportGenrate("mysql", "pdf");
		fg.htmlReportGenrate("mysql", "html");
		fg.docReportGenrate("mysql", "docs");
	}
}