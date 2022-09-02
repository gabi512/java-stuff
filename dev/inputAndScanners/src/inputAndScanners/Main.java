package inputAndScanners;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("Input your age: ");
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		
		int age = Integer.parseInt(s);
		
		if (age >= 18) {
			System.out.print("What's your favorite food? ");
			String food = inp.next();
			if (food.equals("pizza")) {
				System.out.println("Mine too!");
			}
			else {
				System.out.println("Cool!");
			}
		} 
		else if (age >= 13) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are a kid");
		}
		
		/*
		 * sc.next()
		 * sc.nextInt()
		 * sc.nextBoolean()
		 * sc.nextDouble()
		 * */
		
	}

}
