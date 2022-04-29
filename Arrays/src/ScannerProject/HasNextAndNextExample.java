package ScannerProject;

import java.util.Scanner;
public class HasNextAndNextExample {

	public static void main(String[] args) {
		
		String str = "the wound may be not by my mistake , but getting it healed is my duty";
		
				Scanner sc = new Scanner(str); 
				
					while(sc.hasNext()) {
						System.out.println(sc.next());
					}	
					 str ="Manoj 201 25500.45f";
					 String name = "";int empId = 0;float salary = 0.0f;
					
					sc = new Scanner(str);
					
					if(sc.hasNext()) {
						 name = sc.next();
					}
					if(sc.hasNext()) {
						empId = sc.nextInt();
					}
					if(sc.hasNext()) {
						salary = sc.nextFloat();
					}
					if(sc.hasNext()) {                //the tokens got ended theredore hasnext() return 'false'
						System.out.println("of the string");
					}
					System.out.println(empId+ " "+name+" "+salary);					
	        }
}
