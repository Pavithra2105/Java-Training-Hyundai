package Abstraction;

class Maths{

int var1 , var2 , var3;

Maths(int v1 , int v2 , int v3){
	var1 = v1;
	var2 = v2;
	var3 = v3;
}
                                                    
double Calculation() {
	double sal =  var1 + var3 ;
	return sal;
}
double Calculation(int Sub ) {
	double sal =  var1 - Sub ;
	return sal;
}
double Calculation(double Division) {
	double sal =  var1 / Division;
	return sal;
}
double Calculation(float Modulo) {
	double sal =  var1 % Modulo;
	return Modulo;
	
}
}
public class Polymorphism02 {

	public static void main(String[] args) {
		 Maths obj =  new  Maths(20,22,2);
		 Maths obj1 =  new  Maths(40,20,10);
		 Maths obj2 =  new  Maths(12,10, 5);
		 
		 double Calculation  = obj.Calculation();
		 System.out.println("Addition of  : "+Calculation);
		 Calculation = obj1.Calculation(10);
		 System.out.println("Subraction : "+Calculation);
		 Calculation = obj2.Calculation(40.8);
		 System.out.println("Division : "+Calculation);


	}

}
