import java.util.Scanner;

/**
 * @author EricRoberts
 *
 */
public class greatCircleDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare earth average radius as constant
		final double earthRadius = 6371.01;
		
		//start scanner for x1, y1 and x2, y2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		//stop Scanner
		sc.close();
		
		//solve for the distance
		double radius = earthRadius;
		double distance = radius * Math.acos( Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
				
		//display distance
		System.out.println("The distance between the two points is "+ distance);

	}

}
