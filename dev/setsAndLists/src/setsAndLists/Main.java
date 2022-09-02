package setsAndLists;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		/* 
		 * sets
		 * 
		 * you can put another set in the brackets
		 * and the new set will start with the
		 * elements of the old one.
		 * 
		 * HashSet: unordered set of unique elements
		 * TreeSet: ordered set of unique elements (2, 1, 3 -> 1, 2, 3)
		 * LinkedHashSet: like a HashSet, but faster on certain operations
		 */
		
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		t.add(-8);
		t.remove(9);
		
		int x = t.size();
		
		/*
		 * lists
		 * 
		 * almost same functionality as sets. dynamically sized array.
		 * you can add and remove things, has indexes
		 * (like a vector in c++)
		 * 
		 * ArrayList: slower
		 * LinkedList: faster at certain operations
		 */
		
		ArrayList<Integer> tl = new ArrayList<Integer>();
		tl.add(1);
		tl.add(2);
		tl.add(1);
		tl.add(2);
		tl.add(1);
		tl.add(2);
		
		tl.get(0); // gets index
		tl.set(1, 5); // changes (already existing) index
		tl.subList(1, 3); // prints elements in a range not including last index
		
		System.out.println(tl.subList(1, 3));
		
	}

}
