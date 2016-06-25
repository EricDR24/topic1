import java.util.Scanner;

/**
 * @author EricRoberts
 *
 */
public class costOfDriving {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Start scanner for distance
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double distance = sc.nextDouble();
		//end scanner for distance
		
		//start scanner for miles per gallon
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = sc.nextDouble();
		//end scanner for miles per gallon
		
		//start scanner for price per gallon
		System.out.println("Enter price per gallon: ");
		double pricePerGallon = sc.nextDouble();
		//end scanner for price per gallon
		
		sc.close(); //end all scanners
		
		//compute total
		double total = distance / milesPerGallon * pricePerGallon;
		//end compute total
		
		//print total
		System.out.println("The cost of driving is " + total);
		
		
		
		

	}

}
