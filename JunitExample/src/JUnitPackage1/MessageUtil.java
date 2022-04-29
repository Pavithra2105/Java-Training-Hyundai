package JUnitPackage1;

public class MessageUtil {
	private String message;
	
	public MessageUtil(String message) {
		this.message = message;
	}
	
	public String PrintMessage() {
		System.out.println(message);
		return message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
}
