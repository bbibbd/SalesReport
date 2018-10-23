package gibeom.kim.javastudy.salesreport;
import java.util.Scanner;

public class SalesReporter {
	private double highestSales=0, averageSales;
	private int numberOfAssociate;
	private SalesAssociate [] team;
	int sum=0;

	
	Scanner keyboard = new Scanner(System.in);

	public void getData() {
		System.out.println("input the number of associate");
		numberOfAssociate = keyboard.nextInt();

		team = new SalesAssociate[numberOfAssociate];

		for(int i=0; i<numberOfAssociate; i++) {
			team[i]=new SalesAssociate();
			System.out.printf("Enter data for associate #%d\n",i+1);
			System.out.println("Enter name: ");
			team[i].setName(keyboard.next());
			System.out.println("Enter associate's sales (Won):");
			team[i].setSales(keyboard.nextDouble());
		}
	}


	public void computeAverage() {
		for(int i=0;i<numberOfAssociate;i++) {
			sum += team[i].getSales();
		averageSales = sum/numberOfAssociate;
		}
	}

	public void computeHigestSales() {
		double temp;
		for(int i=0;i<numberOfAssociate;i++) {
			temp = team[i].getSales();
			if(highestSales <= temp)	highestSales=temp;			
		}
	}
	
	public void displayResults() {
		System.out.printf("Average Sales per person is %.2f\n", averageSales);
		System.out.printf("Highes sales: %f",highestSales);
	}
}
