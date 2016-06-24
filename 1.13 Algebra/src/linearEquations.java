
public class linearEquations {

	public static void main(String[] args) {
		//Variable assignments 
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		
		//assigned variable in formula
		double x = (e * d) - (b * f) / (a * d) - (b * c);
		double y = (a * f) - (e * c) / (a * d) - (b * c);
		
		//print answer
		System.out.println("x = "+ x + " y = " +y);

	}

}
