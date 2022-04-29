package ArrayListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {
    public static void main(String[] args) {
		
	
		ArrayList<String> Alist1=new ArrayList<String>();
		Alist1.add("Manoj ");
		Alist1.add("Kumar ");
		Alist1.add(" 1234");
		Alist1.add("Brindha");
		Alist1.add("ramesh");
		
		
		System.out.println(Alist1);
		
		Iterator itr= Alist1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("from for-eachLoop");
		for(String name:Alist1) {
			System.out.println(name);
		}
		
		System.out.println("removing item by index");
		Alist1.remove(2);
		System.out.println(Alist1);
		
		System.out.println("removing item by item name");
		Alist1.remove("Surya");
		System.out.println(Alist1);
		
		System.out.println("removing item by index");
		Alist1.set(0,"Sumath");
		System.out.println(Alist1);
		
		Alist1.add("Manoj ");
		Alist1.add("Kumar ");
		Alist1.add(" 1234");
		Alist1.add("Brindha");
		Alist1.add("ramesh");
		Collections.sort(Alist1); //sorting of list
		System.out.println(Alist1);
		
		Alist1.add(0,"My master"); //add an item with the index specified
		System.out.println(Alist1);
		
		ArrayList<String> al1=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();
		
		
		al1.add("chair");
		al2.add("table");
		ArrayList<String> al3=new ArrayList<String>();
		al3.addAll(al1);
		System.out.println(al3);
		al3.addAll(al2);
		System.out.println(al3);
		al3.addAll(0,al2);
		System.out.println(al3);
		
		Student s1=new Student("geetha",11);
		Student s2=new Student("kiran", 22);
		Student s3=new Student("gopika",33);
		
		ArrayList<Student> slist=new ArrayList<Student>();
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		
		System.out.println(slist);
		
		Iterator<Student> itr3 =slist.iterator();	
		
		while(itr3.hasNext()) {
			Student s4=(Student)itr3.next();
			System.out.println(s4.name+" ,"+s4.id);
		}
		
		al1.add("chair"); al1.add("Table");
		al2.add("Sofa"); al2.add("cot");
		System.out.println(al1);
		System.out.println(al2);
		
		al1.retainAll(al2);         //check 'al1' list that has any element of 'al2' and retains those common elements
		
		Iterator<String> itr4 = al1.iterator();
		
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		System.out.println("#####################");
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		al1.clear();
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		
		al1.add("One");
		al1.add("Two");
		al1.add("Three");
		al1.add("Four");
		al1.add("One");
		System.out.println(al1.get(2));    //get the element at the index specified
		al1.add("");
		al1.add(null);
		System.out.println(al1);
	}

}

class Student{
	String name;
	
	int id;
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	
}
