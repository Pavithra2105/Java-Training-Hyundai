package Assessment10;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args)
	{
		ArrayList<String>list1 = new ArrayList<String>();
		list1.add("Manoj");
		list1.add("Kumar");
		list1.add("subu");
		list1.add("Sumath");
      System.out.println("List1: "+ list1);

		ArrayList<String>list2 = new ArrayList<String>();

		list2.add("Kumar");
		list2.add("subu");
		list2.add("Hari");
		list2.add("Manoj");

		System.out.println("List2: "+ list2);
		list1.retainAll(list2);
		System.out.println("Common elements: "+ list1);
	}
}

