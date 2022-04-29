package sample2;

import java.util.ArrayList;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String words = new String("HELLO GOODBYE!");
	     ArrayList<Character> sample = new ArrayList<Character>();

	     for(int i = 0; i<words.length(); i++){
	         sample.add((char)Character.codePointAt((CharSequence) sample,i));
	     }
	}
	}

