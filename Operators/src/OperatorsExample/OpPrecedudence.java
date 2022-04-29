package OperatorsExample;

public class OpPrecedudence {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		System.out.println(10 * 5/2 - ++a * 3 + --b);
		// 50/2 - 4*3 % 4 = 25 - + 4 = 17
		System.out.println(a++ * 3);
		System.out.println(a);
		System.out.println(4+5<<1); //9<<1 so 18 is the ans
		System.out.println((4|2) > 3); //boolean
		System.out.println(a > b - 3); //first - 3 is calcualted then a > b (boolean)
		//System.out.println();
	}

}
