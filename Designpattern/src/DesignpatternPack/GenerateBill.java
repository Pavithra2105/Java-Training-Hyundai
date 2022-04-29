package DesignpatternPack;

import java.io.*;
import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		GetPlanFactory brand = new GetPlanFactory();
		
		System.out.println("Choose the brand of the shirt: ");
		Scanner s = new Scanner(System.in);
		
		
		String brandname = s.nextLine();
		
		Plan p = brand.getPlan(brandname);
		
		System.out.println("Enter the numberShirts you  want to purchase: ");
		s = new Scanner(System.in);
		
		p.getcostofShirt();
		int numofShirt = Integer.parseInt(s.nextLine());
		p.calTotalCost(numofShirt);
	}
	
	
}
