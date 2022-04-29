package sample2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number :");
		int n = s.nextInt();
		s.close();
		ArrayList<Boolean> list=new ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
		if(n == 10) {
		Collections.fill(list, Boolean.TRUE);
		System.out.println(list);
	}else {
		System.out.println(false);
	}
	}

}
