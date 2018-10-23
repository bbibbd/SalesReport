package gibeom.kim.javastudy.salesreport;

public class Main {

	public static void main(String[] args) {
		SalesReporter reporter = new SalesReporter();
		
		reporter.getData();
		reporter.computeAverage();
		reporter.computeHigestSales();
		reporter.displayResults();
	}

}
