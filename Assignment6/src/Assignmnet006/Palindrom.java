package Assignmnet006;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int r,sum=0,temp;    
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the number :");
		  int n = s.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("it is palindrom number ");    
		  else    
		   System.out.println("it is not palindrom");    
		}  

	}

