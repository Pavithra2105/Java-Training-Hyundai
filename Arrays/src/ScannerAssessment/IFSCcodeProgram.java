package ScannerAssessment;

import java.util.Scanner;

public class IFSCcodeProgram {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ente the IFSC code :");
		String code = s.nextLine();
		
		boolean character,integer, IFSC = false;
		
		for(int i=0;i<code.length();i++) {
			char c = code.charAt(i);
			if(i<4) {                                   //CHECK FIRST FOUR TO BE UPPERCASE LETTER
				if(Character.isLetter(c)) {             //IFSC IS MADE TRUE ONLY IT FIRST FOUR ARE ARE CHARS AND THEY ARE UPPER CASE
					if(Character.isUpperCase(c)) {
						IFSC = true;
						continue;
					}else {
						IFSC = false;
						break;
					}
				}
				else {
					IFSC = false;
					break;
				}
			}
			if((IFSC==true) && (i>3)) {                
				if((Character.isDigit(c))) {
					IFSC = true;
					continue;
				}else {
					IFSC = false;
					break;
				}
			}
		}
		if(IFSC == true && code.length()==11) {
			System.out.println("It is a valid IFSC code");
		}else {
			System.out.println("It is a not a valid IFSC code");
		}
	}

}
