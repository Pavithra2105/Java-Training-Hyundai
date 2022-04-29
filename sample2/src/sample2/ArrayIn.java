package sample2;

import java.util.ArrayList;

public class ArrayIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		ArrayList<Integer> Num = new ArrayList<Integer>(n);
		for( int i = 1;i <= n ; i++) {
			Num.add(i);
			System.out.println(Num);
			
		}
	}

}
