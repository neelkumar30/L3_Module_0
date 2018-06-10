package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		ArrayList<String> names = new ArrayList <String>();
		//2. Add five Strings to your list
		names.add("Aaron");
		names.add("Neel");
		names.add("Ozil");
		names.add("Steph");
		names.add("Barry");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < names.size(); i++){
			String n = names.get(i);
			System.out.println(n);
		}
		System.out.print("\n");
		//4. Print all the Strings using a for-each loop
		for (String n : names) {
			System.out.println(n);
		}
		System.out.print("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i+=2) {
			String n = names.get(i);
			System.out.println(n);
		}
		System.out.print("\n");
		//6. Print all the Strings in reverse order.
		for (int i = names.size()-1; i > -1; i--) {
			String n = names.get(i);
			System.out.println(n);
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i++) {
			String n = names.get(i);
			if(n.contains("e")) {
				System.out.println(n);
			}
		}
	}
}
