import java.util.Scanner;
 

/**
 * @author EricRoberts
 *
 */
public class interestRate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//start scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = sc.nextDouble();
		double interestRate = sc.nextDouble() / 100;
		//end scanner
		
		//compute interest
		double interest = balance * (interestRate / 12);
		//end compute interest
		
		//print interest rate
		System.out.println("The interest is " + interest);

	}

}
