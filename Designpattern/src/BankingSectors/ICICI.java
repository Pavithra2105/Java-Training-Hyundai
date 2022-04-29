package BankingSectors;

public class ICICI implements Bank{

	private String bankname;
	ICICI(){bankname = "ICICI Bank";}

	public String getBankName() {
		return bankname;
	}
}
