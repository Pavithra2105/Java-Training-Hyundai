package BankingSectors;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getbank(String bank) {
		if(bank==null) 
			return null;
		
		if(bank.equalsIgnoreCase("HDFC"))
			return new HDFC();
		if(bank.equalsIgnoreCase("ICICI"))
			return new ICICI();
		
		return null;
	}

	@Override
	public Abstraction getLoan(String loan) {
		if(loan==null)
		return null;
		
	if(loan.equalsIgnoreCase("HousingLoan"))
		return new HousingLoan();
	
	if(loan.equalsIgnoreCase("PersonalLoan"))
		return new PersonalLoan();
	
	if(loan.equalsIgnoreCase("VehicleLoan"))
		return new VehicleLoan();
	
	return null;
	}
}
