package whileLoops;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a number: ");
		int x = sc.nextInt();
		int count = 0;
		
		while (x != 10) {
			System.out.print("Type a number: ");
			x = sc.nextInt();
			count++;
		}
		
		System.out.println("You messed up " + count + " times");
	}

}
