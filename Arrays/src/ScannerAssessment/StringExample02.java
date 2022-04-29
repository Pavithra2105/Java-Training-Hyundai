package ScannerAssessment;

import java.util.Scanner;

public class StringExample02 {

	public static void main(String[] args) {
		 String str;
		 int upper=0,lower=0,num=0,Special=0;
		
		  Scanner scan=new Scanner(System.in); 
	    
		System.out.println("Enter the String = ");
		str=scan.nextLine();
		
		for(int i=0; i<str.length(); i++){
		char charA=str.charAt(i);
		
		if(charA>='A' && charA<='Z'){//check uppercase
		    upper++;
		}
		else if(charA>='a' && charA<='z'){ //check lowercase
		    lower++;
		}
		else if(charA>='0' && charA<='9'){  //check numeric
		    num++;
		}
		else{
		    Special++;
		}
		}
		System.out.println("lowercase letters: "+lower);
		System.out.println("uppercase letters: "+upper);
		System.out.println("Number: "+num);
		System.out.println("Special characters: "+Special);
		 }

}
