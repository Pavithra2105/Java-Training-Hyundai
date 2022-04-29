package Annotation;

import java.util.*;

class Annot{
	
	@Deprecated
	void display() {
		System.out.println("Display of Annot");
	}
	void display1() {
		System.out.println("Display of Annot not Depracted");
	}
}

class Bnnot extends Annot {
	
	void display(){    //made the spell mistake
		System.out.println("Display of Bnnot");
	}
	
	class Cnnot{
		
	}
}
public class AnnotationExample {
	
     @SuppressWarnings({"rawtype", "unchecked" })
	public static void main(String[] args) {
		Bnnot bn = new Bnnot();
		bn.display();
		
		List li = new ArrayList();
		li.add(10);
		li.add("Shankar");
		
		System.out.println(li);
		
		Annot An = new Annot();
		An.display();

	}

}
