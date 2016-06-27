
 
/**
 * @author EricRoberts
 *
 */
public class primeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create stack
		GenericStack<Integer> stack = new GenericStack<>();
		final int primeNumbers = 50; // Number of prime numbers
		int count = 0;
		for (int i = 2; count < primeNumbers; i++) {
			if (isPrime(i)) {
				stack.push(i);
				count++;
			}
		}
		//display prime numbers
		System.out.println("The first 50 prime numbers in descending order: ");
		for (int i = 1; !stack.isEmpty(); i++){
			if (i % 10 == 0)
				System.out.printf("%3d\n", stack.pop());
			else
				System.out.printf("%3d ", stack.pop());
		}
		System.out.println();
	

	}
		//return true when n = prime number
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
