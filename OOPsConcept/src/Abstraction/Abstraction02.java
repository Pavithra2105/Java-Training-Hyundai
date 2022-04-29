package Abstraction;

abstract class Vehicle{
	
	abstract void Wheelers();
	
}
class TwoWheeler extends Vehicle{
	int Bike;
	
	TwoWheeler(int B){
		Bike = B;
	}
	
	void Wheelers() {
		if(Bike == 2) {
			System.out.println("It is an Bike ");
		}else {
			System.out.println("it is not a 2 wheeler");
		}
	}	
}
class ThreeWheeler extends Vehicle{
	int Auto;
	
	ThreeWheeler(int A){
		Auto = A;
	}
	void Wheelers() {
		if(Auto == 3) {
		System.out.println("It is an Auto ");
	}else {
		System.out.println("it is not a 3 wheeler");
	}
  }
}
class FourWheeler extends Vehicle{
	int Car;
	
	FourWheeler(int C){
		Car = C;
	}
	void Wheelers() {
		if(Car == 4) {
		System.out.println("It is an Car ");
	}else {
		System.out.println("it is not a 4 wheeler");
	}
}
}
class SixWheeler extends Vehicle{
		int Lorry;
			
		SixWheeler(int L){
			Lorry = L;
		}
		void Wheelers() {
			if(Lorry == 6) {
			System.out.println("It is an Lorry ");
		}else {
			System.out.println("it is not a 6 wheeler");
		}
		}
	
}
public class Abstraction02 {

	public static void main(String[] args) {

		TwoWheeler obj = new TwoWheeler(2);
		obj.Wheelers();
		ThreeWheeler obj2 = new ThreeWheeler(3);
		obj2.Wheelers();
		FourWheeler obj4 = new FourWheeler(4);
		obj4.Wheelers();
		SixWheeler obj5 = new SixWheeler(6);
		obj5.Wheelers();

	}

}
