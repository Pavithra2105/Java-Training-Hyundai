package Abstraction;

import java.util.Scanner;

interface Housing{
	void SingleBedRoom();
	void TwoBedRoom();
	void ThreeBedRoom();
	
	static void Staticmethod() {
		System.out.println("I am a static method");
	}
}
class Brigade implements Housing {
	
	@Override
	public void SingleBedRoom() {
		System.out.println("Brigade");
		System.out.println("Square feet = 418sq ft");
		System.out.println("Apartment = 1BHK");
		System.out.println("Rate = 41.11L");
		System.out.println("\n");
	}
	@Override
	public void TwoBedRoom() {
		System.out.println("Brigade");
		System.out.println("Square feet = 700sq ft");
		System.out.println("Apartment = 2BHK");
		System.out.println("Rate = 86.20L");
		System.out.println("\n");	
	}
	@Override
	public void ThreeBedRoom() {
		System.out.println("Brigade");
		System.out.println("Square feet = 1,680sq ft");
		System.out.println("Apartment = 3BHK");
		System.out.println("Rate = 1.20Cr");
		System.out.println("\n");	
	}	
}

class Purvankara implements Housing {

	@Override
	public void SingleBedRoom() {
		System.out.println("Purvankara");
		System.out.println("Square feet = 550sq ft");
		System.out.println("Apartment = 1BHK");
		System.out.println("Rate = 41.11L");
		System.out.println("\n");
	}
	@Override
	public void TwoBedRoom() {
		System.out.println("Purvankara");
		System.out.println("Square feet = 750sq ft");
		System.out.println("Apartment = 2BHK");
		System.out.println("Rate = 89.20L");
		System.out.println("\n");	
	}
	@Override
	public void ThreeBedRoom() {
		System.out.println("Purvankara");
		System.out.println("Square feet = 1,890sq ft");
		System.out.println("Apartment = 3BHK");
		System.out.println("Rate = 1.20Cr");
		System.out.println("\n");	
	}
}

public class AssignmentInterface {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many bedroom you need = ");
		int num = s.nextInt();
		
		Brigade obj = new Brigade();
		if(num == 1) {
		obj.SingleBedRoom();
		}else if(num==2){
		obj.TwoBedRoom();
		}else if(num == 3) {
		obj.ThreeBedRoom();
		}
		
		Purvankara obj1 = new Purvankara();
		if(num == 1) {
			obj1.SingleBedRoom();
			}else if(num==2){
			obj1.TwoBedRoom();
			}else if(num == 3) {
			obj1.ThreeBedRoom();
			}
		//Brigade.Staticmethod();
	}
}
