package ControlStatement;

import java.util.Scanner;

public class SwitchState {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int day;
		System.out.println("Enter weekday Number =");
		day = s.nextInt();
		s.close();
		
		switch(day) {
		case 1:
			System.out.println("1st - Monday !");
			break;
		case 2:
			System.out.println("2nd - Tuesday !");
			break;
		case 3:
			System.out.println("3rd - Wednesday !");
			break;
		case 4:
			System.out.println("4th - Thursday !");
			break;
		case 5:
			System.out.println("5th - Friday !");
			break;
		case 6:
			System.out.println("6th - Saturday !");
			break;
		case 7:
			System.out.println("7th - Sunday !");
			break;
		default:
			System.out.println("Invalid !");
		}
	}
}
