package BankingSectors;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);
	public abstract Abstraction getLoan(String loan);

	

}
