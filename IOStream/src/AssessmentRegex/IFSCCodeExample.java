package AssessmentRegex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IFSCCodeExample {

	public static void main(String[] args) {
		char ch = 'y';
		String s;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Enter the IFSC code : ");
			String code = sc.nextLine();
			System.out.println("Entered IFSC code : "+code);
			
			if(Pattern.matches("[A-Z]{4}\\d{7}",code)) {
				System.out.println();
				System.out.println("Yes, It is a IFSC code");
			}else {
				System.out.println("No, It is not a IFSC code");
			}
			
			 
			 
		
		
		

	}while(ch=='y' || ch=='Y' );
		sc.close();
	}

}
