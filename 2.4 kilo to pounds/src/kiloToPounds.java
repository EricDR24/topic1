import java.util.Scanner;


public class kiloToPounds {

	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nummber in pounds: ");
		
		double pounds = sc.nextDouble();
		double kilograms = pounds * 0.454;
		
		//print answer
		System.out.println(+ pounds + " pounds is " + kilograms + " kilograms");

	}

}
