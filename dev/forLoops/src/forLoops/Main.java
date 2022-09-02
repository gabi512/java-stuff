package forLoops;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// for loop
		int[] arr = {0, 1, 13, 2, 4, 8, 13};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 13) {
				System.out.println("Found a 13 at index " + i);
			}
		}
		
		// for each
		int count = 0;
		for (int element:arr) {
			System.out.println(element + " at index " + count);
			count++;
		}
		
		// populating an array using a for loop
		String[] names = new String[5];
		Scanner inp = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("Input: ");
			String name = inp.nextLine();
			names[i] = name;
		}
		
		for (String name:names) {
			if (name.toLowerCase().equals("tim")) {
				break;
			}
			else {
				System.out.println(name);
			}
		}
		
	}

}
