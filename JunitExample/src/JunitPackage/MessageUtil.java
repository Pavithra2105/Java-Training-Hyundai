package JunitPackage;

import org.junit.Test;

public class MessageUtil {

	private String message;
	
	public MessageUtil(String message) {
		this.message = message;
	}
	@Test
	public String salutationMessage() {
		System.out.println(message);
		return message;
	}
}
