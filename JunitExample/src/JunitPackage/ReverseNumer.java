package JunitPackage;

import java.util.Scanner;

import org.junit.Test;

	public class ReverseNumer {


@Test
public void ReverseNumer() {
			int num , reverse= 0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number=" );
			num =sc.nextInt();
			
	        while (num > 0) {
	        	int LD =num%10;
	            reverse = reverse * 10 + LD;
	            num = num / 10;
	        }
	      
	        		System.out.println("the reversed number is= "+reverse);

		}

	} 



