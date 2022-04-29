package ControlStatement;
import java.util.Scanner;
public class IfState {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age;
		System.out.println("Enter your age =");
		age = s.nextInt();
		if(age >= 18) {
			System.out.println("you are eligible for Voting !");
		}else {
			System.out.println("you are not eligible for Voting !");
		}

	}

}
