package arrayListDemo;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		/*Creation of ArrayList: I'm going to add string
		 * elements so I made it of string type
		 */
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ranjit");
		obj.add("Borey");
		obj.add("Ulvy");
		obj.add("Yuth");
		obj.add("Maru");
		obj.set(3, "Sles");
		/* Display array list elements */
		System.out.println("Currently the array has following elements : " + obj);
		
		/* Add elements at the given index */
		obj.add(0, "Steve");
		obj.add(1, "Justin");
		
		/* Remore elements from array list like this */
		obj.remove("Ranjit");
		
		System.out.println("Current array list is : " + obj);
		
		/* Remove element from the given index */
		obj.remove(1);
		System.out.println("Current array list is : " + obj);
		System.out.println(obj.contains("Ranjit"));
		System.out.println(obj.get(2));
		System.out.println(obj.indexOf("Yuth"));
		
	}
}
