package BankingSectors;

abstract public class Abstraction {
	protected double rateofInt;
	
	abstract void getRateofInt();
	
	public void calEMI(int loanamount , int years) {
		
		double EMI;
		double timeperiod, principal ,simpleInt , totalsum;
		
		
		timeperiod = years;
		principal = loanamount;
		
		simpleInt= principal * timeperiod * rateofInt / 100;
		
		totalsum = principal + simpleInt;
		
		EMI = totalsum/(timeperiod*12);
		
		System.out.println("EMI is :"+EMI);
;		
	}

}
