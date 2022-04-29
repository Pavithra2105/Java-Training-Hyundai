package SetInterfaceAndCollection;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
Hashtable<String, Integer> hml = new Hashtable<String, Integer>();
		
		
		hml.put("Manoj", 22);
		hml.put("Ananth", 55);
		hml.put("Banumathi", 45);
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
		hml.put("Banumathi", 67);
		hml.put("Ananth", 48);
		hml.put("Kavitha", 33);
		
		System.out.println("....keyset......");
		for(String i:hml.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("....values......");
		for(Integer i:hml.values()) {
			System.out.println(i);
		}
		
		System.out.println("..........");
		for(String i:hml.keySet()) {   //set view
			System.out.println(i +" "+" & value: "+hml.get(i));
		}
		
		System.out.println(".....entryset.....");
		for(Map.Entry i: hml.entrySet()) {  //using Map.Entry- Collection view
			System.out.println(i.getKey() + " " + i.getValue());
		}

	}

}
