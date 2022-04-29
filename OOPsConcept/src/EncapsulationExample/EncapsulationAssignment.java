package EncapsulationExample;

import java.util.Scanner;

class Empcap{
	
	private int cost ;
	String Fruit;
	int Kg ;
	int value;
	int x = 15;
	int y = 20;
	int z = 5;
	int Apple;
	int Mango;
	int Orange;
	
	Empcap(String Fr ,int k ){
		Fruit = Fr;
		Kg = k;
    }
	
	int CalApple() {
		
		return Apple = Kg * x;
	}
	
	int CalMango() {
		
		return Mango = Kg * y;
	}
	
	int CalOrangle() {
		
		return Orange = Kg * z;
	}
	
	
	void Display(){
		if( Fruit == "apple") {
		System.out.println("Rate of Apple = "+Apple);
		}else if(Fruit == "mango"){
		System.out.println("Rate of Mango = "+Mango);
		}else if(Fruit == "orange"){
		System.out.println("Rate of Orange = "+Orange);
		}
    }
}

    

public class EncapsulationAssignment {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Fruit = ");
		String f = s.next();
		System.out.println("Enter KG = ");
		int k = s.nextInt();	
		
		Empcap obj = new Empcap(f,k);
		obj.Display();
		
	}

}
