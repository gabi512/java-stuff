package mapsExercise;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map m = new HashMap();
		String str = "<insert random string here>";
		int count = 0;
		char temp = '0';
		
		while (temp != ' ') {
			for (int i = 0; i < str.length(); i++) {
				temp = str.toCharArray()[i];
				
				for (char c:str.toCharArray()) {
					if (temp == c) {
						count++;
						if (temp == ' ') {
							m.put("spaces", count);
						}
						else {
							m.put(temp, count);
						}
					}
				}
				System.out.println("put element in map: " + m.keySet());
				System.out.println("reset counter");
				count = 0;
			}
			
			temp = ' ';
		}
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("RESULT:");
		System.out.println(m);

	}

}
