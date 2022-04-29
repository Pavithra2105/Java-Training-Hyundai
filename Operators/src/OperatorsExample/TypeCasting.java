package OperatorsExample;

public class TypeCasting {

	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		float c = a + b;  //widening
		System.out.println(c);
		
		float p = 4;
		float q = 7;  
		int r =(int)(p + q);    // float cannot convert into integer    by saying ( int ) at the beginning.
		//int r =(int)(p + q); implecit automatic
		System.out.println(c);
		//narrowing
		
		int x = 15;
		long y = x;
		float z = y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		//x = y; we cannot able to convert long to int
		x = (int)y;  //forcing or type casting. ( it is used to convert )
		
		

	}

}
