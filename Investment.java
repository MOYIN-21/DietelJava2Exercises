import java.util.Scanner;
	public class Investment{
		public static void main(String[] args) {
		Scanner house = new Scanner(System.in);
			
		System.out.print("Enter investment amount:");
		double investmentAmount = house.nextDouble();
		
		System.out.print("Enter around interest rate in percentage:");
		double annualInterestRate = house.nextDouble();
		
		double monthlyInterestRate = annualInterestRate/ 1200;
		
		System.out.print("Enter number of years: ");
		double numberOfYears = house.nextDouble();
	
		futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate)  NumberOfYears*12);
	
	

}


}
