package BankingSectors;

import java.util.Scanner;

public class AbstractFactoryPatternExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Bank Name : ");
		String bankname = sc.nextLine();
		
		System.out.println("Enter the Loan Name : ");
		String loanname = sc.nextLine();
		
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank bank = bankFactory.getBank(bankname);
		
		AbstractFactory loanFactory = FactoryCreator.getFactory("Bank");
		Bank loan = Abstraction.getLoan(loanname);
		
		loan.getRateofInt();
		loan.loanType();
		
		System.out.println("Your are taking the "+loan.loantype+" form "+ bank.getBankName() " at the rate "+ loan.displayrateofint());
		
		System.out.
	}

}
