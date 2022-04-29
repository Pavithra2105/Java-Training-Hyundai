package BankingSectors;

public class HousingLoan extends Abstraction {
   void getRateofInt() {
	   rateofInt = 7.5;
   }	
}

class PersonalLoan extends Abstraction {
	void getRateofInt() {
		rateofInt = 10.5;
	}
}

class VehicleLoan extends Abstraction {
	void getRateofInt() {
		rateofInt = 12.5;
	}
}
 