package sample1;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter the number 1 =");
		a = s.nextInt();
		System.out.println("Enter the number 2 =");
		b = s.nextInt();
		s.close();
		int c = a + b;
		System.out.println("Total = "+c);
	}

}
