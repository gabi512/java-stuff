package conditionsAndBooleans;

public class Main {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		int z = 3;
		
		String str1 = "hello";
		String str2 = "world";
		
		/*
		 * >
		 * <
		 * ==
		 * >=
		 * <=
		 * !=
		 * */
		
		boolean compare = !(x < y && y > z) || (z + 2 == 5 || x + 7 > y);
		
		/*
		 * && (and)
		 * || (or)
		 * ! (not)
		 * */
		
		System.out.println(compare);
		
	}
	
}
