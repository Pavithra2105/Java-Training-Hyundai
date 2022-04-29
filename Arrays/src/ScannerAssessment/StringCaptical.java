package ScannerAssessment;

import java.util.Scanner;

public class StringCaptical {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter : ");
		String m =s.nextLine();
		
		char[] charA = m.toCharArray();
	    boolean found = true;

	    for(int i = 0; i < charA.length; i++) {
	      if(Character.isLetter(charA[i])) {

	        if(found) {
	          charA[i] = Character.toUpperCase(charA[i]);
	          found = false;
	        }
	      }
	      else {
	        found = true;
	      }
	    }
	    m = String.valueOf(charA);
	    System.out.println(m);
	  }  
	}

