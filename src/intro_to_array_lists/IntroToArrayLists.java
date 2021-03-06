package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		// 2. Add five Strings to your list
		// 3. Print all the Strings using a standard for-loop
		// 4. Print all the Strings using a for-each loop
		// 5. Print only the even numbered elements in the list.
		// 6. Print all the Strings in reverse order.
		// 7. Print only the Strings that have the letter 'e' in them.

		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Hello");
		stringList.add("How");
		stringList.add("Are");
		stringList.add("You");
		stringList.add("Today?");

		for (int i = 0; i < stringList.size(); i++) {
			String s = stringList.get(i);
			System.out.println(s);
		}
		System.out.println();

		for (String s : stringList) {
			System.out.println(s);
		}
		System.out.println();

		for (int i = 0; i < stringList.size(); i++) {
			if (i % 2 == 0) {
				String s = stringList.get(i);
				System.out.println(s);
			}
		}
		System.out.println();

		for (int i = stringList.size() - 1; i >= 0; i--) {
			String s = stringList.get(i);
			System.out.println(s);
		}
		System.out.println();
		
		for (String s : stringList) {
			if(s.contains("e")) {
				System.out.println(s);
			}	
		}
	}
}
