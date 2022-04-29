package ControlStatement;
import java.util.*;
public class Number {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a;
	int b;
	int c;
	System.out.println("Enter the Number 1=");
	a = s.nextInt();
	System.out.println("Enter the Number 2=");
	b = s.nextInt();
	System.out.println("Enter the Number 3=");
	c = s.nextInt();
	
	
	if(a<b && a<c) {
		System.out.println("Number 1 is Smallest :"+a );
	}else if(b<c) {
		System.out.println("Number 2 is Smallest :"+b);
	}else{
		System.out.println("Number 3 is Smallest :"+c);
	}
	}

}
