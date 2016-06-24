import java.util.Scanner;
/**
 * 
 */

/**
 * @author EricRoberts
 *
 */
public class gratuityRate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Start Scanner input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subtotal and gratuity rate here: ");
		double subtotal = sc.nextDouble();
		double gratuityRate = sc.nextDouble();
		
		//gratuity and total calculation
		double gratuity = subtotal * gratuityRate * 0.01;
		double total = subtotal + gratuity;
		
		//print answer
		System.out.println("The gratuity is $" + gratuity + " and the total is $" +total);
		

	}

}
