package ControlStatement;

public class ContinueStatement {

	public static void main(String[] args) {
	
		for(int i=1;i<=20;i++) {
			if(i%8==0) {
			continue;
			}
			System.out.print(i+" ");
		}
	}
}
