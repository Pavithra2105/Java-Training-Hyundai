package SerializationDeserialization;
import java.io.*;

public class DeserializaationExample {

	public static void main(String[] args) {
		
		String s = "D:\\FileSerial.txt";
		try
		{
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(s));
			OurStudent st =(OurStudent)input.readObject();
			
			System.out.println(st.id+" "+st.name);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}
}
