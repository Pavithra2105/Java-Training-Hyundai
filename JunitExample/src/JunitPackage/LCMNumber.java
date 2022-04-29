package JunitPackage;

import java.util.Scanner;

import org.junit.Test;

public class LCMNumber {

	Scanner sc=new Scanner(System.in);
	int n1;
	int n2;
	int n3;
	int temp;
	int small;
	int LCM=0;
	
	@Test
	public void LCMNumber() {
		System.out.println("enter the first number");
		n1=sc.nextInt();
		System.out.println("enter the second number");
		n2=sc.nextInt();
		System.out.println("enter the third number");
		n3=sc.nextInt();
		
		
		if(n1>n2) {
			temp=n1;
		}else {
			temp=n2;
		}
		if(n1<n2) {
			small=n1;
		}else {
			small=n2;
		}
	int i=1;
	int big=temp;
	for(; i<=small; i++) {
		temp= big*i;
		if(temp%small==0) {
			LCM=temp;
			break;
		}
	}
	if (LCM>n3) {
		temp=LCM;
	}else {
		small=n3;
	}
	i=1;
	big=temp;
	for(; i<=small; i++) {
		temp = big*i;
		if (temp%small ==0) {
			LCM =temp;
			break;
		}
	}
	System.out.println("LCM  " +LCM);
}
}
