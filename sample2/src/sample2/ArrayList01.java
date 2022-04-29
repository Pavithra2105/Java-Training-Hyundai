package sample2;

import java.util.ArrayList;

public class ArrayList01{

	public static void main(String[] args) {
		
		ArrayList<String> Anim = new ArrayList<String>();
		
		//Add
		Anim.add("Dog");
		Anim.add("Cat");
		Anim.add("Lion");
		Anim.add("Tiger");
		Anim.add("Deer");
		Anim.add("Leopard");
		
		System.out.println(Anim);
		
		//remove
		Anim.remove(3);
		Anim.remove(4);
		System.out.println(Anim);
	}

}
