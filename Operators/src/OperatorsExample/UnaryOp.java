package OperatorsExample;

public class UnaryOp {

	public static void main(String[] args) {
		
		//++ , -- , + , - , ! , ~ tilde
		
		int a = 10;
		int b = 11;
		int c = 12;
		int x,y,z;
		
		a++;  //post
		System.out.println("a ="+a); // a = 11
		
		++a; //pre
		System.out.println("a ="+a);
		
		x = a++;
		System.out.println("a ="+a);
		System.out.println("x ="+x);
		
		x = ++a;
		System.out.println("a ="+a);
		System.out.println("x ="+x);
		
		x = -a;
		System.out.println("x ="+x);
		
		x = +(x);
		System.out.println("x ="+x);
		
		boolean p = true;  //printing true
		boolean q =!p;  //(!p)NOT p so it is false
		System.out.println("p ="+p);
		System.out.println("q ="+q);
		
		byte j = 30;
		System.out.println(~j);  //one complement  
		
		byte k = -15;
		System.out.println(~k);
	}

}
