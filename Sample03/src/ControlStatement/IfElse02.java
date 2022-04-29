package ControlStatement;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int Num;
		System.out.println("Enter your mark :");
		Num = s.nextInt();
		s.close();

        if (Num >= 90) {
            System.out.println("Grade A : " +Num);
        } else if (Num >= 80) {
        	System.out.println("Grade B : " +Num);
        } else if (Num >= 70) {
        	System.out.println("Grade C : "+Num);
        } else if (Num >= 60) {
        	System.out.println("Grade D : "+Num);
        } else {
        	System.out.println("Grade F : "+Num);
	}
	}
}

