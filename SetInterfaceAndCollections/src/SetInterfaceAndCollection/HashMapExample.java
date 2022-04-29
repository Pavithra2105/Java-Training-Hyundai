package SetInterfaceAndCollection;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hml = new HashMap<String, Integer>();
		
		
		hml.put("Manoj", 22);
		hml.put("Ananth", 55);
		hml.put("Banumathi", null);
		hml.put("Ananth", 48);
		hml.put("Kavitha", 33);
		
		System.out.println(hml);
		System.out.println(hml.get("Ananth"));
		
		System.out.println("\nprint size ..........");
		System.out.println(hml.size());
		System.out.println("\nAfter removing Ananth............");
		hml.remove("Ananth");
		System.out.println(hml);
		
		System.out.println("..........");
		hml.clear();
		System.out.println("\nAfter clearing..........");
		System.out.println(hml);
		
		System.out.println("..........");
		System.out.println();
		hml.put("Manoj", 22);
		hml.put("Ananth", 55);
		hml.put("Banumathi", null);
		hml.put("Ananth", 48);
		hml.put("Kavitha", 33);
		
		System.out.println("..........");
		for(String i:hml.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("..........");
		for(Integer i:hml.values()) {
			System.out.println(i);
		}
		
		System.out.println("..........");
		for(String i:hml.keySet()) {   //set view
			System.out.println(i +" "+" & value: "+hml.get(i));
		}
		
		System.out.println("..........");
		for(Map.Entry i: hml.entrySet()) {  //using Map.Entry- Collection view
			System.out.println(i.getKey() + " " + i.getValue());
		}
		
}

}
