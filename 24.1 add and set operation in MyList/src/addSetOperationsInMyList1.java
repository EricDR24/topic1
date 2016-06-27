import java.util.Arrays;

/**
 * @author EricRoberts
 *
 */
public class addSetOperationsInMyList1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create strings
		String[] array1 = {"Tom", "George", "Peter", "Jean", "Jane"};
		MyList1<String> list1 = new MyArrayList1<>(array1);

		String[] array2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};
		MyList1<String> list2 = new MyArrayList1<>(array2);
		System.out.println("Create two MyArrayLists:");
		print(list1, list2);
		
		
		//display list1 and list2.
		System.out.println("Invoke list1.addAll(list2):");
		list1.addAll(list2);
		print(list1, list2);

		// recreates the lists and invokes
		System.out.println("Recreates list1 and list2,"
		 + "\ninvoke list1.removeAll(list2), and displays list1 and list2:");
		list1.clear();
		list1.addAll(new MyArrayList1<>(array1));
		list1.removeAll(list2);
		print(list1, list2);

		//recreates and invokes
		System.out.println("Recreates list1 and list2," 
		+ "\ninvokes list1.retainAll(list2), and displays list1 and list2:");
		list1.clear();
		list1.addAll(new MyArrayList1<>(array1));
		list1.retainAll(list2);
		print(list1, list2);
	}

	// displays the list
	public static void print(MyList1<String> list1, MyList1<String> list2) {
		System.out.println("List1: " + list1);
		System.out.println("List2: " + list2);
		System.out.println();
	}

}
