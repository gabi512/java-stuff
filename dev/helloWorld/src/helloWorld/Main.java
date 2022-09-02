package helloWorld;

public class Main {
	
	public static void main(String[] args) {
		int x = 13;
		int y = 7;
		double sum = x / y;
		
		System.out.println(sum);
		
		/*
		 * if one of our operands is a double,
		 * everything is going to be a double!
		 * e.g. double x / int y = double result
		 * 
		 * if all of them are integers,
		 * result is going to be an integer too!
		 * e.g. int x / int y = int result
		 */
		
		// type casting
		double tc = x / (double)y;
		System.out.println(tc);
		
		// modulus
		int remainder = 56 % 5;
		System.out.println(remainder);
	}
}
