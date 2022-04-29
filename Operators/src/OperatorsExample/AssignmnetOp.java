package OperatorsExample;

public class AssignmnetOp {

	public static void main(String[] args) {
		// == , += , -= , /= , %= , <<= , >>=
		
		int a = 3;
		int b = 5;
		
		a+=b;
		System.out.println(a);
		b-=a;
		System.out.println(b);
		a*=b;
		System.out.println(a);
		b/=a;
		System.out.println(b);
		a%=5;
		System.out.println(a);
		
		   a = 3;
		
		a<<=3;
		System.out.println(a);
		a>>=1;
		System.out.println(a);
	}

}
